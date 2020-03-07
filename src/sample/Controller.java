package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {

    Main Perehod =new Main();
    Main Open_papka = new Main();
    Zapros Zapros =new Zapros();
    String BND20PersBezNK1="Абдулвалеев Р.Х.";
    String BND20PersBezNK2="Абузаров Г.Р.";
    String BND20PersBezNK3="Байкалов В.А.";
    String BND20PersBezNK4="Батталов А.Г.";

    String BND20PersBezNK5;
    String BND20PersBezNK6;
    String BND20PersBezNK7;
    String BND20PersBezNK8;
    String BND20PersBezNK9;
    String BND20PersBezNK10;
    String BND20PersBezNK11;
    String BND20PersBezNK12;
    String BND20PersBezNK13;
    String BND20PersBezNK14;
    String BND20PersBezNK15;
    String BND20PersBezNK16;

    ObservableList<String> langs = FXCollections.observableArrayList("Абдулвалеев Р.Х.", "Абузаров Г.Р.", "Байкалов В.А.", "Батталов А.Г."/*,selectionBnd20.getText()*/);

    ObservableList<Position> Spisok = FXCollections.observableArrayList();

    @FXML
    private TableView<Position> tableBND20;
    @FXML
    private TableView<Position> tableMNG20;
    @FXML
    private TableColumn<Position, String> idPosition;
    @FXML
    private TableColumn<Position, String> TypeTuColumn;
    @FXML
    private TableColumn<Position, String> NameTuColumn;
    @FXML
    private TableColumn<Position, String> ZavTuColumn;
    @FXML
    private TableColumn<Position, String> RegTuColumn;
    @FXML
    private TableColumn<Position, String> MestorozhdenieColumn;
    @FXML
    private TableColumn<Position, String> ObektColumn;
    @FXML
    private TableColumn<Position, String> SkvazhinaColumn;


    public javafx.scene.control.TextField TextMng20PapOpen, TextPositionMNG20;
    public javafx.scene.control.TextField TextBnd20PapOpen, TextPositionBND20;
    public javafx.scene.control.ListView ListView;
    public javafx.scene.control.Label lable1;

    @FXML
    public ToggleGroup ToggleBND20ispolnenie;
    @FXML
    public ToggleGroup ToggleBND20factshurf;
    @FXML
    public ToggleGroup ToggleBND20actshurf;
    @FXML
    public ToggleGroup ToggleBND20luklaz;
    @FXML
    public ToggleGroup ToggleBND20naryad;
    @FXML
    public ToggleGroup ToggleBND20ostanov;
    @FXML
    public ToggleGroup ToggleBND20vnutreniiosmotr;
    @FXML
    public ToggleGroup ToggleBND20defctsvedomost;
    @FXML
    public DatePicker DataOstanovStartMNG20, DataOstanovEndMNG20;
    @FXML
    public DatePicker DataOstanovStartBND20, DataOstanovEndBND20;
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
    private Button ButBnd20AgzuOpen;
    @FXML
    private Button ButBnd20SosudOpen;
    @FXML
    private Button ButBnd20SosudSave;
    @FXML
    private Button ButBnd20RvsOpen;
    @FXML
    private Button ButBnd20UaOpen;
    @FXML
    private Button ButBnd20SkOpen;
    @FXML
    private Button ButBnd20BgUrOpen;
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
    private CheckBox BoxBND20PersBezNK1, BoxBND20PersBezNK2,BoxBND20PersBezNK3,BoxBND20PersBezNK4,BoxBND20PersBezNK5,BoxBND20PersBezNK6,BoxBND20PersBezNK7,BoxBND20PersBezNK8;
    @FXML
    private CheckBox BoxBND20PersBezNK9, BoxBND20PersBezNK10,BoxBND20PersBezNK11,BoxBND20PersBezNK12,BoxBND20PersBezNK13,BoxBND20PersBezNK14,BoxBND20PersBezNK15,BoxBND20PersBezNK16;

    Alert a = new Alert(Alert.AlertType.NONE);
    public int id=1;

    public Controller() {
    }

    @FXML
    private void initialize() {
        ListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ListView.getSelectionModel().select(langs);
        ListView.getItems().addAll(langs);

        idPosition.setCellValueFactory(new PropertyValueFactory<Position, String>("position"));
        TypeTuColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("TypeTu"));
        NameTuColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("NameTu"));
        ZavTuColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("ZavTu"));
        RegTuColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("RegTu"));
        MestorozhdenieColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("Mestorozhdenie"));
        ObektColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("Obekt"));
        SkvazhinaColumn.setCellValueFactory(new PropertyValueFactory<Position, String>("Skvazhina"));
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

            String allSelected = "";
            BoxBND20PersBezNK1.setText("Абдулвалеев Р.Х.");
                if(BoxBND20PersBezNK1.isSelected())
                    allSelected = "Java ";

                if(BoxBND20PersBezNK2.isSelected()) allSelected = "JavaScript ";
                if(BoxBND20PersBezNK3.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK4.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK5.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK6.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK7.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK8.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK9.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK10.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK11.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK12.isSelected()) allSelected = "C#";
                if(BoxBND20PersBezNK13.isSelected()) allSelected = "C#";


                if(allSelected.equals(""))
                    lable1.setText("No languages selected");
                else
                    lable1.setText(allSelected);

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
                id++;
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
            LocalDate OstanovStart;
            LocalDate OstanovEnd;
            RadioButton selectedRadioButton1  = (RadioButton) ToggleBND20ispolnenie.getSelectedToggle();
            RadioButton selectedRadioButton2  = (RadioButton) ToggleBND20factshurf.getSelectedToggle();
            RadioButton selectedRadioButton3  = (RadioButton) ToggleBND20actshurf.getSelectedToggle();
            RadioButton selectedRadioButton4  = (RadioButton) ToggleBND20luklaz.getSelectedToggle();
            RadioButton selectedRadioButton5  = (RadioButton) ToggleBND20naryad.getSelectedToggle();
            RadioButton selectedRadioButton6  = (RadioButton) ToggleBND20ostanov.getSelectedToggle();
            if (selectedRadioButton1 == null){
                Ispolnenie="";
            } else if(selectedRadioButton1.getText()=="Подземное") {
                Ispolnenie = "Подземное";
            }else if(selectedRadioButton1.getText()=="Надземное") {
                Ispolnenie = "Надземное";
            }
            if (selectedRadioButton2 == null){
                Factshurf="";
            }else if(selectedRadioButton2.getText()== "Нет") {
                Factshurf = "Нет";
            }else if(selectedRadioButton2.getText()== "Да"){
                Factshurf="Да";
            }
            if (selectedRadioButton3 == null){
                Factshurf="";
            }else if(selectedRadioButton3.getText()== "Нет") {
                Actshurf = "Нет";
            }else if(selectedRadioButton3.getText()== "Да"){
                Actshurf="Да";
            }
            if (selectedRadioButton4 == null){
                Luklaz="";
            }else if(selectedRadioButton4.getText()== "Нет") {
                Luklaz = "Нет";
            }else if(selectedRadioButton4.getText()== "Да"){
                Luklaz="Да";
            }
            if (selectedRadioButton5 == null){
                Naryad="";
            }else if(selectedRadioButton5.getText()== "Нет") {
                Naryad = "Нет";
            }else if(selectedRadioButton5.getText()== "Да"){
                Naryad="Да";
            }
            if (selectedRadioButton6 == null){
                Ostanov="";
            }else if(selectedRadioButton6.getText()== "Нет") {
                Ostanov = "Нет";
            }else if(selectedRadioButton6.getText()== "Да"){
                Ostanov="Да";
            }
            OstanovStart = DataOstanovStartBND20.getValue();
            OstanovEnd = DataOstanovEndBND20.getValue();

            // Function call
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
            String OstanovStartBND20= formatter.format(OstanovStart);
            String OstanovEndBND20= formatter.format(OstanovStart);

            Zapros.SendSpisokBND20(Ispolnenie, Factshurf, Actshurf, Luklaz, Naryad, Ostanov, OstanovStartBND20,OstanovEndBND20);

        });
    }
}
