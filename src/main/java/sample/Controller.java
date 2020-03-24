package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.BoundingBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {

    Main Perehod =new Main();
    Main Open_papka = new Main();
    Zapros Zapros =new Zapros();
    String BND20Pers1="Абдуллин А.Р.";
    String BND20Pers2="Ахметшин Р.М.";
    String BND20Pers3="Байсарин И.Р.";
    String BND20Pers4="Гизатуллин И.Р.";
    String BND20Pers5="Кузнецов С.И.";
    String BND20Pers6="Михайлов В.В.";
    String BND20Pers7="Разяпов А.Ф.";
    String BND20Pers8="Фасхутдинов Р.Р.";
    String BND20Pers9="Халиков А.И.";
    String BND20Pers10="Чернышов А.Б.";
    String BND20Pers11="Юсупов И.А.";
    String BND20Pers12="(Пусто)";
    String BND20Pers13="(Пусто)";
    String BND20Pers14="(Пусто)";
    String BND20Pers15="(Пусто)";
    String BND20Pers16="(Пусто)";
    String BND20ExpNonte1="Голуб Е.Д";
    String BND20ExpNonte2="Михайлов Е.А.";
    String BND20ExpNonte3="Шафиков А.Ф.";
    String BND20ExpNonte4="Семенов В.Ю";
    String BND20PersNote1="Калинин В.А.";
    String BND20PersNote2="Иванов А.А.";
    String BND20PersNote3="Гусар А.Г.";
    String BND20PersNote4="Галяутдинов Э.И.";
    String BND20PersNote5="Чернышов А.Б";
    String BND20PersNote6="Евсевьев А.А.";
    String BND20PersNote7="Тицкий Э.А.";
    String BND20PersNote8="Абдулин А.Р.";
    String positions[] =new String[100];
    int i=0;

    ObservableList<String> langs = FXCollections.observableArrayList("Абдулвалеев Р.Х.", "Абузаров Г.Р.", "Байкалов В.А.", "Батталов А.Г."/*,selectionBnd20.getText()*/);

    ObservableList<Position> Spisok = FXCollections.observableArrayList();

    @FXML
    private TableView<Position> tableBND20;
    @FXML
    private TableView<Position> tableMNG20;
    @FXML
    private TableColumn<Position, String> idPositionBND20;
    @FXML
    private TableColumn<Position, String> TypeTuColumnBND20;
    @FXML
    private TableColumn<Position, String> NameTuColumnBND20;
    @FXML
    private TableColumn<Position, String> ZavTuColumnBND20;
    @FXML
    private TableColumn<Position, String> RegTuColumnBND20;
    @FXML
    private TableColumn<Position, String> MestorozhdenieColumnBND20;
    @FXML
    private TableColumn<Position, String> ObektColumnBND20;
    @FXML
    private TableColumn<Position, String> SkvazhinaColumnBND20;
    @FXML
    private TextField TextMng20PapOpen, TextPositionMNG20;
    @FXML
    private TextField TextBnd20PapOpen, TextPositionBND20;
    @FXML
    private ListView ListView;
    @FXML
    private TextArea TextDefectsBND20,TextPrimechanieBND20;
    @FXML
    private TextField TextIskluchenieBND20;
    @FXML
    public DatePicker DataOstanovStartMNG20, DataOstanovEndMNG20;
    @FXML
    public DatePicker DataOstanovStartBND20, DataOstanovEndBND20, DataBezNkBND20,DataNkBND20,DataActNoDocBND20, DataActNegotBND20,DataNoteExpBND20,DataNotePersBND20;
    @FXML
    public ToggleGroup ToggleBND20ispolnenie, ToggleBND20factshurf,ToggleBND20actshurf,ToggleBND20luklaz,ToggleBND20naryad,ToggleBND20ostanov,ToggleBND20vnutreniiosmotr,ToggleBND20defctsvedomost,ToggleBND20iskluchenie,ToggleBND20documents;
    @FXML
    public ToggleGroup ToggleMNG20ispolnenie,ToggleMNG20factshurf,ToggleMNG20actshurf,ToggleMNG20luklaz,ToggleMNG20naryad,ToggleMNG20ostanov,ToggleMNG20vnutreniiosmotr,ToggleMNG20defctsvedomost,ToggleMNG20resultatpovtornogo,ToggleMNG20zapisivpasporte;
    @FXML
    public ToggleGroup ToggleBnd20;
    @FXML
    public RadioButton RadBnd20Skvoznoi;
    @FXML
    public RadioButton RadBnd20Nomzakl;
    @FXML
    private Button ButAddSpisokMNG20, ButSendSpisokMNG20, ButClearSpisokMNG20;
    @FXML
    private Button ButAddSpisokBND20, ButSendSpisokBND20, ButClearSpisokBND20;
    @FXML
    private Button ButKurva;
    @FXML
    private Button ButBnd20PapkOpen;
    @FXML
    private Button ButMng20PapkOpen;
    @FXML
    private Button ButBnd20SvodnayaOpen;
    @FXML
    private Button ButBnd20SvodnayaSave;
    @FXML
    private Button ButBnd20BgUrOpen, ButBnd20SkOpen,ButBnd20UaOpen,ButBnd20RvsOpen,ButBnd20SosudOpen,ButBnd20AgzuOpen,ButBnd20SosudSave;
    @FXML
    private Button ButBnd20UdeOpen;
    @FXML
    private Button ButBnd20NasosOpen;
    @FXML
    private Button ButBnd20NasosSave;
    @FXML
    private Button ButBnd20MoneyOpen;
    @FXML
    private Button ButMng20SvodnayaOpen;
    @FXML
    private Button ButMng20PromyselOpen;
    @FXML
    private Button ButMng20TechnOpen;
    @FXML
    private Button ButMng20SosudOpen;
    @FXML
    private Button ButMng20UaOpen;
    @FXML
    private Button ButMng20AgzuOpen;
    @FXML
    private Button ButMng20BgUrOpen;
    @FXML
    private Button ButMng20RvsOpen;
    @FXML
    private Button ButMng20NasosOpen;
    @FXML
    private Button ButMng20MoneyOpen;
    @FXML
    private Button ButMng20SvodnayaSave;
    @FXML
    private Button ButMng20PromyselSave;
    @FXML
    private Button ButMng20TechnSave;
    @FXML
    private Button ButMng20SosudSave;
    @FXML
    private Button ButMng20UaSaven;
    @FXML
    private Button ButMng20AgzuSave;
    @FXML
    private Button ButMng20BgUrSave;
    @FXML
    private Button ButMng20RvsSave;
    @FXML
    private Button ButMng20NasosSave;
    @FXML
    private Button ButMng20KompresOpen;
    @FXML
    private Button ButMng20KompresSave;
    @FXML
    private CheckBox BoxBND20ExpNonte1, BoxBND20ExpNonte2,BoxBND20ExpNonte3,BoxBND20ExpNonte4, BoxBND20SpecNote1,BoxBND20SpecNote2,BoxBND20SpecNote3,BoxBND20SpecNote4,BoxBND20SpecNote5,BoxBND20SpecNote6,BoxBND20SpecNote7,BoxBND20SpecNote8;
    @FXML
    private CheckBox BoxBND20PersBezNK1, BoxBND20PersBezNK2,BoxBND20PersBezNK3,BoxBND20PersBezNK4,BoxBND20PersBezNK5,BoxBND20PersBezNK6,BoxBND20PersBezNK7,BoxBND20PersBezNK8;
    @FXML
    private CheckBox BoxBND20PersBezNK9, BoxBND20PersBezNK10,BoxBND20PersBezNK11,BoxBND20PersBezNK12,BoxBND20PersBezNK13,BoxBND20PersBezNK14,BoxBND20PersBezNK15,BoxBND20PersBezNK16;
    @FXML
    private CheckBox BoxBND20PersNK1, BoxBND20PersNK2,BoxBND20PersNK3,BoxBND20PersNK4,BoxBND20PersNK5,BoxBND20PersNK6,BoxBND20PersNK7,BoxBND20PersNK8;
    @FXML
    private CheckBox BoxBND20PersNK9, BoxBND20PersNK10,BoxBND20PersNK11,BoxBND20PersNK12,BoxBND20PersNK13,BoxBND20PersNK14,BoxBND20PersNK15,BoxBND20PersNK16;
    Alert a = new Alert(Alert.AlertType.NONE);
    public int id=1;

    @FXML
    private void initialize() {
        ListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ListView.getSelectionModel().select(langs);
        ListView.getItems().addAll(langs);
        BoxBND20ExpNonte1.setText(BND20ExpNonte1);
        BoxBND20ExpNonte2.setText(BND20ExpNonte2);
        BoxBND20ExpNonte3.setText(BND20ExpNonte3);
        BoxBND20ExpNonte4.setText(BND20ExpNonte4);
        BoxBND20PersBezNK1.setText(BND20Pers1);
        BoxBND20PersBezNK2.setText(BND20Pers2);
        BoxBND20PersBezNK3.setText(BND20Pers3);
        BoxBND20PersBezNK4.setText(BND20Pers4);
        BoxBND20PersBezNK5.setText(BND20Pers5);
        BoxBND20PersBezNK6.setText(BND20Pers6);
        BoxBND20PersBezNK7.setText(BND20Pers7);
        BoxBND20PersBezNK8.setText(BND20Pers8);
        BoxBND20PersBezNK9.setText(BND20Pers9);
        BoxBND20PersBezNK10.setText(BND20Pers10);
        BoxBND20PersBezNK11.setText(BND20Pers11);
        BoxBND20PersBezNK12.setText(BND20Pers12);
        BoxBND20PersBezNK13.setText(BND20Pers13);
        BoxBND20PersBezNK14.setText(BND20Pers14);
        BoxBND20PersBezNK15.setText(BND20Pers15);
        BoxBND20PersBezNK16.setText(BND20Pers16);
        BoxBND20PersNK1.setText(BND20Pers1);
        BoxBND20PersNK2.setText(BND20Pers2);
        BoxBND20PersNK3.setText(BND20Pers3);
        BoxBND20PersNK4.setText(BND20Pers4);
        BoxBND20PersNK5.setText(BND20Pers5);
        BoxBND20PersNK6.setText(BND20Pers6);
        BoxBND20PersNK7.setText(BND20Pers7);
        BoxBND20PersNK8.setText(BND20Pers8);
        BoxBND20PersNK9.setText(BND20Pers9);
        BoxBND20PersNK10.setText(BND20Pers10);
        BoxBND20PersNK11.setText(BND20Pers11);
        BoxBND20PersNK12.setText(BND20Pers12);
        BoxBND20PersNK13.setText(BND20Pers13);
        BoxBND20PersNK14.setText(BND20Pers14);
        BoxBND20PersNK15.setText(BND20Pers15);
        BoxBND20PersNK16.setText(BND20Pers16);
        BoxBND20SpecNote1.setText(BND20PersNote1);
        BoxBND20SpecNote2.setText(BND20PersNote2);
        BoxBND20SpecNote3.setText(BND20PersNote3);
        BoxBND20SpecNote4.setText(BND20PersNote4);
        BoxBND20SpecNote5.setText(BND20PersNote5);
        BoxBND20SpecNote6.setText(BND20PersNote6);
        BoxBND20SpecNote7.setText(BND20PersNote7);
        BoxBND20SpecNote8.setText(BND20PersNote8);

        idPositionBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("position"));
        TypeTuColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("TypeTu"));
        NameTuColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("NameTu"));
        ZavTuColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("ZavTu"));
        RegTuColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("RegTu"));
        MestorozhdenieColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("Mestorozhdenie"));
        ObektColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("Obekt"));
        SkvazhinaColumnBND20.setCellValueFactory(new PropertyValueFactory<Position, String>("Skvazhina"));
    }

    public void clickbnd() {
        ButBnd20SvodnayaOpen.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1JdPtXLrRxmLAqvBIKczJ0p_GRtRUfMyfr1DDtaR1fqc/edit#gid=1158543");
        });
        ButBnd20SvodnayaSave.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/u/1/d/1JdPtXLrRxmLAqvBIKczJ0p_GRtRUfMyfr1DDtaR1fqc/export?format=xlsx");
        });
        ButBnd20NasosOpen.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1kLUmeZdywOmCDK2QP-zgvYLDOBbyHMqMBForkss10m4/edit#gid=228724568");
        });
        ButBnd20NasosSave.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/u/1/d/1kLUmeZdywOmCDK2QP-zgvYLDOBbyHMqMBForkss10m4/export?format=xlsx");
        });
        ButBnd20SosudOpen.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/u/1/d/1Ghp7oQ1fHG4zEp2DWp8_h09Br9EODaOqq0D6Nasw1PE/edit#gid=1406996571");
        });
        ButBnd20SosudSave.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/u/1/d/1Ghp7oQ1fHG4zEp2DWp8_h09Br9EODaOqq0D6Nasw1PE/export?format=xlsx");
        });
        ButBnd20MoneyOpen.setOnAction(Event -> {
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/16tJdfdXr8UDO-E0LTzNn_vDP48PCsJpN_7wgkApcR80/edit#gid=1623052075");
        });
        ButBnd20PapkOpen.setOnAction(Event -> {

            RadioButton selectedRadioButton   = (RadioButton) ToggleBnd20.getSelectedToggle();
            if ("По сквозному".equals(selectedRadioButton.getText())) {
                String PapkaBnd = TextBnd20PapOpen.getText();
                String ZakazchikBnd = "N:/Отдел ЭПБ/1. Архив исходных документов от заказчиков/2020/Башнефть-Добыча/2. Документы на ТУ";
                Open_papka.Open_papka(PapkaBnd, ZakazchikBnd);
            } else if ("По номеру заключения".equals(selectedRadioButton.getText())) {
                String PapkaBnd = TextBnd20PapOpen.getText();
                Zapros.PoiskPoNomeru(PapkaBnd);
            }
        });
    }
    public void clickmng() {
        ButMng20SvodnayaOpen.setOnAction(Event -> {//Мегион Сводная
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1xGdmmJ7D7K7C-Yd7F3SpYxqYu6YSOBjPv_4QdDdd0dc/edit#gid=770641835");
        });
        ButMng20SvodnayaSave.setOnAction(Event -> {//Мегион Сводная
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1xGdmmJ7D7K7C-Yd7F3SpYxqYu6YSOBjPv_4QdDdd0dc/export?format=xlsx");
        });
        ButMng20PromyselOpen.setOnAction(Event -> {//Мегион Промысел
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1qH-v8VcNDU0rCHREOS4UzSFz6Qi4PZThmm-gwTi14yg/edit#gid=167986224");
        });
        ButMng20PromyselSave.setOnAction(Event -> {//Мегион Промысел
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1qH-v8VcNDU0rCHREOS4UzSFz6Qi4PZThmm-gwTi14yg/export?format=xlsx");
        });
        ButMng20TechnOpen.setOnAction(Event -> {//Мегион Техноложка
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1ffYiIrxeRqXjS1msFcxw-rEc4m6hIzLG3dV5Sj_RqwI/edit#gid=167986224");
        });
        ButMng20TechnSave.setOnAction(Event -> {//Мегион Техноложка
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1ffYiIrxeRqXjS1msFcxw-rEc4m6hIzLG3dV5Sj_RqwI/export?format=xlsx");
        });
        ButMng20SosudOpen.setOnAction(Event -> {//Мегион Сосуды
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1rCAZDQ1hTrioPVrmJGrSPkuaPSNHwI7c4Obr4xJDGd4/edit#gid=2037736545");
        });
        ButMng20SosudSave.setOnAction(Event -> {//Мегион Сосуды
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1rCAZDQ1hTrioPVrmJGrSPkuaPSNHwI7c4Obr4xJDGd4/export?format=xlsx");
        });
        ButMng20UaOpen.setOnAction(Event -> {//Мегион УА
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1NAS5cIJaWy8PlS01iZViMbJQW9y3H-QMNpU70C0tWQk/edit#gid=167986224");
        });
        ButMng20UaSaven.setOnAction(Event -> {//Мегион УА
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1NAS5cIJaWy8PlS01iZViMbJQW9y3H-QMNpU70C0tWQk/export?format=xlsx");
        });
        ButMng20AgzuOpen.setOnAction(Event -> {//Мегион Агзу
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1XaO42_wvhRcHPToACQWEr2XIUeBrS4ktfM_lNMpb3Ic/edit#gid=1853339197");
        });
        ButMng20AgzuSave.setOnAction(Event -> {//Мегион Агзу
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1XaO42_wvhRcHPToACQWEr2XIUeBrS4ktfM_lNMpb3Ic/export?format=xlsx");
        });
        ButMng20BgUrOpen.setOnAction(Event -> {//Мегион БГ
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/10YKvp2OVcejUluXrcggA8b_ZfFunowiCde5j2RFjhxE/edit#gid=510578297");
        });
        ButMng20BgUrSave.setOnAction(Event -> {//Мегион БГ
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/10YKvp2OVcejUluXrcggA8b_ZfFunowiCde5j2RFjhxE/export?format=xlsx");
        });
        ButMng20RvsOpen.setOnAction(Event -> {//Мегион РВС
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1_UH84ZwFPOE0tCnlLgRIEgCyezSEBm4XBF8Pa2PeYLQ/edit#gid=357399027");
        });
        ButMng20RvsSave.setOnAction(Event -> {//Мегион РВС
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1_UH84ZwFPOE0tCnlLgRIEgCyezSEBm4XBF8Pa2PeYLQ/export?format=xlsx");
        });
        ButMng20NasosOpen.setOnAction(Event -> {//Мегион Насос
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/12T4rftlBaySthuRu8_T7wfhMuYtMdJWdrcv4LqLIw70/edit#gid=1853339197");
        });
        ButMng20NasosSave.setOnAction(Event -> {//Мегион Насос
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/12T4rftlBaySthuRu8_T7wfhMuYtMdJWdrcv4LqLIw70/export?format=xlsx");
        });
        ButMng20KompresOpen.setOnAction(Event -> {//Мегион Компрессор
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1_GGGGT5QMUajH5uTvRg9kJhf6qVhMDurqKLbhqI4RVE/edit#gid=2024792800");
        });
        ButMng20KompresSave.setOnAction(Event -> {//Мегион Компрессор
            Perehod.Perehod("https://docs.google.com/spreadsheets/d/1_GGGGT5QMUajH5uTvRg9kJhf6qVhMDurqKLbhqI4RVE/export?format=xlsx");
        });
        ButMng20MoneyOpen.setOnAction(Event -> {//Мегион Деньги
            Perehod.Perehod("");
        });
        ButMng20PapkOpen.setOnAction(Event -> {
            String PapkaMng = TextMng20PapOpen.getText();
            String ZakazchikMng = "N:/Отдел ЭПБ/1. Архив исходных документов от заказчиков/2020/Славнефть-Мегионнефтегаз/2. Документы на ТУ";
            Open_papka.Open_papka(PapkaMng, ZakazchikMng);
        });
    }
    public void kurva() {
        ButKurva.setOnAction(Event -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/SvodnayaBND2020.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setOpacity(1);
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 1920, 980));
            stage.showAndWait();
        });
    }

    public void DefectoskpostMNG() {
        ButAddSpisokMNG20.setOnAction(Event -> {
            String position = TextPositionMNG20.getText();
            if(position.length()==0){
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Не указана позиция которую надо добавить");
                a.show();
            }else{
                String zakazchik ="Мегион 2020";
                Zapros.PoiskPoSkvoznomu(position, zakazchik);
            Spisok.add(new Position(id, Zapros.Position,Zapros.TypeTu,Zapros.NameTu,Zapros.ZavTu,Zapros.RegTu,Zapros.Mestorozhdenie, Zapros.Obekt,Zapros.Skvazhina));
                id++;
            tableMNG20.setItems(Spisok);
            }
        });
        ButClearSpisokMNG20.setOnAction(Event -> {
            Spisok.clear();
            tableMNG20.setItems(Spisok);
        });
        ButSendSpisokMNG20.setOnAction(Event -> {
            String Ispolnenie="";
            String Factshurf="";
            String Actshurf="";
            String Luklaz="";
            String Naryad="";
            String Ostanov="";
            LocalDate OstanovStart;
            LocalDate OstanovEnd;
            RadioButton selectedRadioButton1  = (RadioButton) ToggleMNG20ispolnenie.getSelectedToggle();
            RadioButton selectedRadioButton2  = (RadioButton) ToggleMNG20factshurf.getSelectedToggle();
            RadioButton selectedRadioButton3  = (RadioButton) ToggleMNG20actshurf.getSelectedToggle();
            RadioButton selectedRadioButton4  = (RadioButton) ToggleMNG20luklaz.getSelectedToggle();
            RadioButton selectedRadioButton5  = (RadioButton) ToggleMNG20naryad.getSelectedToggle();
            RadioButton selectedRadioButton6  = (RadioButton) ToggleMNG20ostanov.getSelectedToggle();
            if (selectedRadioButton1 == null) {
                Ispolnenie = "";
            }else if (selectedRadioButton1.getText() == "Подземное") {
                    Ispolnenie = "Подземное";
            } else {
                Ispolnenie = "Надземное";
            }
            if ("Да".equals(selectedRadioButton2.getText())){
                Factshurf="Да";
            } else if("Нет".equals(selectedRadioButton2.getText())) {
                Factshurf = "Нет";
            }else{
                Factshurf="";
            }
            if ("Да".equals(selectedRadioButton3.getText())){
                Actshurf="Да";
            } else if("Нет".equals(selectedRadioButton3.getText())) {
                Actshurf = "Нет";
            }else{
                Actshurf="";
            }
            if ("Да".equals(selectedRadioButton4.getText())){
                Luklaz="Да";
            } else if("Нет".equals(selectedRadioButton4.getText())) {Luklaz = "Нет";}else{
                Luklaz="";
            }
            if ("Да".equals(selectedRadioButton5.getText())){
                Naryad="Да";
            } else if("Нет".equals(selectedRadioButton5.getText())) {Naryad = "Нет";}else{
                Naryad="";
            }
            if ("Да".equals(selectedRadioButton6.getText())){
                Ostanov="Да";
            } else if("Нет".equals(selectedRadioButton6.getText())) {Ostanov = "Нет";}else{
                Ostanov="";
            }
            OstanovStart = DataOstanovStartMNG20.getValue();
            OstanovEnd = DataOstanovEndMNG20.getValue();

        });
    }
    public void DefectoskpostBND() {

        ButAddSpisokBND20.setOnAction(Event -> {
            String position = TextPositionBND20.getText();
            if(position.length()==0){
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Не указана позиция которую надо добавить");
                a.show();
            }else{
                String zakazchik ="Башнефть 2020";
                Zapros.PoiskPoSkvoznomu(position, zakazchik);
                Spisok.add(new Position(id, Zapros.Position,Zapros.TypeTu,Zapros.NameTu,Zapros.ZavTu,Zapros.RegTu,Zapros.Mestorozhdenie, Zapros.Obekt,Zapros.Skvazhina));
                positions[i]=Zapros.Position;
                i++;
                tableBND20.setItems(Spisok);
            }
        });
        ButClearSpisokBND20.setOnAction(Event -> {
            Spisok.clear();
            tableBND20.setItems(Spisok);
        });
        ButSendSpisokBND20.setOnAction(Event -> {
            String Ispolnenie="";
            String Factshurf="";
            String Actshurf="";
            String Luklaz="";
            String Naryad="";
            String Ostanov="";
            String iskluchenie="";
            String osmotr="";
            String documents="";
            String defctsvedomost="";

            String prichinaiskluchenia=TextIskluchenieBND20.getText();
            String defects=TextDefectsBND20.getText();
            String primechanie=TextPrimechanieBND20.getText();
            RadioButton selectedRadioButton1  = (RadioButton) ToggleBND20ispolnenie.getSelectedToggle();
            RadioButton selectedRadioButton2  = (RadioButton) ToggleBND20factshurf.getSelectedToggle();
            RadioButton selectedRadioButton3  = (RadioButton) ToggleBND20actshurf.getSelectedToggle();
            RadioButton selectedRadioButton4  = (RadioButton) ToggleBND20luklaz.getSelectedToggle();
            RadioButton selectedRadioButton5  = (RadioButton) ToggleBND20naryad.getSelectedToggle();
            RadioButton selectedRadioButton6  = (RadioButton) ToggleBND20ostanov.getSelectedToggle();
            RadioButton selectedRadioButton7  = (RadioButton) ToggleBND20iskluchenie.getSelectedToggle();
            RadioButton selectedRadioButton8  = (RadioButton) ToggleBND20defctsvedomost.getSelectedToggle();
            RadioButton selectedRadioButton9  = (RadioButton)ToggleBND20vnutreniiosmotr.getSelectedToggle();
            RadioButton selectedRadioButton10  = (RadioButton)ToggleBND20documents.getSelectedToggle();
            if (selectedRadioButton1 == null){
                Ispolnenie="";
            } else if(selectedRadioButton1.getText().equals("Подземное")) {
                Ispolnenie = "Подземное";
            }else if(selectedRadioButton1.getText().equals("Надземное")) {
                Ispolnenie = "Надземное";
            }
            if (selectedRadioButton2 == null){
                Factshurf="";
            }else if(selectedRadioButton2.getText().equals("Нет")) {
                Factshurf = "Нет";
            }else if(selectedRadioButton2.getText().equals("Да")){
                Factshurf="Да";
            }
            if (selectedRadioButton3 == null){
                Factshurf="";
            }else if(selectedRadioButton3.getText().equals("Нет")) {
                Actshurf = "Нет";
            }else if(selectedRadioButton3.getText().equals("Да")){
                Actshurf="Да";
            }
            if (selectedRadioButton4 == null){
                Luklaz="";
            }else if(selectedRadioButton4.getText().equals("Нет")) {
                Luklaz = "Нет";
            }else if(selectedRadioButton4.getText().equals("Да")){
                Luklaz="Да";
            }
            if (selectedRadioButton5 == null){
                Naryad="";
            }else if(selectedRadioButton5.getText().equals("Нет")) {
                Naryad = "Нет";
            }else if(selectedRadioButton5.getText().equals("Да")){
                Naryad="Да";
            }
            if (selectedRadioButton6 == null){
                Ostanov="";
            }else if(selectedRadioButton6.getText().equals("Нет")) {
                Ostanov = "Нет";
            }else if(selectedRadioButton6.getText().equals("Да")){
                Ostanov="Да";
            }
            if (selectedRadioButton7 == null){
                iskluchenie="";
            }else if(selectedRadioButton7.getText().equals("Нет")) {
                iskluchenie = "Нет";
            }else if(selectedRadioButton7.getText().equals("Да")){
                iskluchenie="Да";
            }
            if (selectedRadioButton8 == null){
                defctsvedomost="";
            }else if(selectedRadioButton8.getText().equals("Нет")) {
                defctsvedomost = "Нет";
            }else if(selectedRadioButton8.getText().equals("Да")){
                defctsvedomost="Да";
            }
            if (selectedRadioButton9 == null){
                osmotr="";
            }else if(selectedRadioButton9.getText().equals("Нет")) {
                osmotr = "Нет";
            }else if(selectedRadioButton9.getText().equals("Да")){
                osmotr="Да";
            }
            if (selectedRadioButton10 == null){
                documents="";
            }else if(selectedRadioButton10.getText().equals("Нет")) {
                documents = "Нет";
            }else if(selectedRadioButton10.getText().equals("Да")){
                documents="Да";
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
            String ostanovstart= "";
            String ostanovend="";
            String databeznk="";
            String datank="";
            String dataactnegot="";
            String dataactnodoc="";
            String datanoteexp="";
            String datanotepers="";
            if(DataOstanovStartBND20.getValue()==null) {
                ostanovstart = "";
            }else{
            ostanovstart= formatter.format(DataOstanovStartBND20.getValue());
            }

            if(DataOstanovEndBND20.getValue()==null) {
                ostanovend = "";
            }else{
                ostanovend= formatter.format(DataOstanovEndBND20.getValue());
            }
            if(DataBezNkBND20.getValue()==null) {
                databeznk = "";
            }else{
                databeznk= formatter.format(DataBezNkBND20.getValue());
            }
            if(DataActNegotBND20.getValue()==null) {
                dataactnegot = "";
            }else{
                dataactnegot= formatter.format(DataActNegotBND20.getValue());
            }
            if(DataActNoDocBND20.getValue()==null) {
                dataactnodoc = "";
            }else{
                dataactnodoc= formatter.format(DataActNoDocBND20.getValue());
            }
            if(DataNkBND20.getValue()==null) {
                datank = "";
            }else{
                datank= formatter.format(DataNkBND20.getValue());
            }
            if(DataNoteExpBND20.getValue()==null) {
                datanoteexp = "";
            }else{
                datanoteexp= formatter.format(DataNoteExpBND20.getValue());
            }
            if(DataNotePersBND20.getValue()==null) {
                datanotepers = "";
            }else{
                datanotepers= formatter.format(DataNotePersBND20.getValue());
            }

            String SelectedPersBezNK = "";
            String SelectedPersNK = "";
            String SelectedExpNote = "";
            String SelectedPersNote = "";

            if(BoxBND20PersBezNK1.isSelected()) SelectedPersBezNK += BND20Pers1 + ", ";
            if(BoxBND20PersBezNK2.isSelected()) SelectedPersBezNK += BND20Pers2+", ";
            if(BoxBND20PersBezNK3.isSelected()) SelectedPersBezNK += BND20Pers3+", ";
            if(BoxBND20PersBezNK4.isSelected()) SelectedPersBezNK += BND20Pers4+", ";
            if(BoxBND20PersBezNK5.isSelected()) SelectedPersBezNK += BND20Pers5+", ";
            if(BoxBND20PersBezNK6.isSelected()) SelectedPersBezNK += BND20Pers6+", ";
            if(BoxBND20PersBezNK7.isSelected()) SelectedPersBezNK += BND20Pers7+", ";
            if(BoxBND20PersBezNK8.isSelected()) SelectedPersBezNK += BND20Pers8+", ";
            if(BoxBND20PersBezNK9.isSelected()) SelectedPersBezNK += BND20Pers9+", ";
            if(BoxBND20PersBezNK10.isSelected()) SelectedPersBezNK += BND20Pers10+", ";
            if(BoxBND20PersBezNK11.isSelected()) SelectedPersBezNK += BND20Pers11+", ";
            if(BoxBND20PersBezNK12.isSelected()) SelectedPersBezNK += BND20Pers12+", ";
            if(BoxBND20PersBezNK13.isSelected()) SelectedPersBezNK += BND20Pers13+", ";
            if(BoxBND20PersBezNK14.isSelected()) SelectedPersBezNK += BND20Pers14+", ";
            if(BoxBND20PersBezNK15.isSelected()) SelectedPersBezNK += BND20Pers15+", ";
            if(BoxBND20PersBezNK16.isSelected()) SelectedPersBezNK += BND20Pers16+", ";
            if(BoxBND20PersNK1.isSelected()) SelectedPersNK += BND20Pers1 + ", ";
            if(BoxBND20PersNK2.isSelected()) SelectedPersNK += BND20Pers2+", ";
            if(BoxBND20PersNK3.isSelected()) SelectedPersNK += BND20Pers3+", ";
            if(BoxBND20PersNK4.isSelected()) SelectedPersNK += BND20Pers4+", ";
            if(BoxBND20PersNK5.isSelected()) SelectedPersNK += BND20Pers5+", ";
            if(BoxBND20PersNK6.isSelected()) SelectedPersNK += BND20Pers6+", ";
            if(BoxBND20PersNK7.isSelected()) SelectedPersNK += BND20Pers7+", ";
            if(BoxBND20PersNK8.isSelected()) SelectedPersNK += BND20Pers8+", ";
            if(BoxBND20PersNK9.isSelected()) SelectedPersNK += BND20Pers9+", ";
            if(BoxBND20PersNK10.isSelected()) SelectedPersNK += BND20Pers10+", ";
            if(BoxBND20PersNK11.isSelected()) SelectedPersNK += BND20Pers11+", ";
            if(BoxBND20PersNK12.isSelected()) SelectedPersNK += BND20Pers12+", ";
            if(BoxBND20PersNK13.isSelected()) SelectedPersNK += BND20Pers13+", ";
            if(BoxBND20PersNK14.isSelected()) SelectedPersNK += BND20Pers14+", ";
            if(BoxBND20PersNK15.isSelected()) SelectedPersNK += BND20Pers15+", ";
            if(BoxBND20PersNK16.isSelected()) SelectedPersNK += BND20Pers16+", ";
            if(BoxBND20ExpNonte1.isSelected()) SelectedExpNote += BND20ExpNonte1 + ", ";
            if(BoxBND20ExpNonte2.isSelected()) SelectedExpNote += BND20ExpNonte2 + ", ";
            if(BoxBND20ExpNonte3.isSelected()) SelectedExpNote += BND20ExpNonte3 + ", ";
            if(BoxBND20ExpNonte4.isSelected()) SelectedExpNote += BND20ExpNonte4 + ", ";
            if(BoxBND20SpecNote1.isSelected()) SelectedPersNote += BND20PersNote1 + ", ";
            if(BoxBND20SpecNote2.isSelected()) SelectedPersNote += BND20PersNote2 + ", ";
            if(BoxBND20SpecNote3.isSelected()) SelectedPersNote += BND20PersNote3 + ", ";
            if(BoxBND20SpecNote4.isSelected()) SelectedPersNote += BND20PersNote4 + ", ";
            if(BoxBND20SpecNote5.isSelected()) SelectedPersNote += BND20PersNote5 + ", ";
            if(BoxBND20SpecNote6.isSelected()) SelectedPersNote += BND20PersNote6 + ", ";
            if(BoxBND20SpecNote7.isSelected()) SelectedPersNote += BND20PersNote7 + ", ";
            if(BoxBND20SpecNote8.isSelected()) SelectedPersNote += BND20PersNote8 + ", ";
            while(i!=0) {
                i--;
            Zapros.SendSpisokBND20(positions[i], datanoteexp, SelectedExpNote, datanotepers, SelectedPersNote, Ispolnenie, Factshurf, Actshurf, Luklaz, Naryad,
                    Ostanov, ostanovstart, ostanovend, osmotr, databeznk, SelectedPersBezNK, dataactnegot, dataactnodoc, datank, SelectedPersNK,documents,defects, defctsvedomost,primechanie, iskluchenie,prichinaiskluchenia);
            }
            Spisok.clear();
            tableBND20.setItems(Spisok);
        });
    }
}
