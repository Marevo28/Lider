package sample;

public class Position {
    public int Id;
    public String position;
    public String TypeTu;
    public String NameTu;
    public String ZavTu;
    public String RegTu;
    public String Mestorozhdenie;
    public String Obekt;
    public String Skvazhina;
    public String Ispolnenie;

    public Position(int Id,String position, String TypeTu, String NameTu, String ZavTu, String RegTu, String Mestorozhdenie, String Obekt, String Skvazhina/*,String Ispolnenie*/) {
        this.Id = Id;
        this.position = position;
        this.TypeTu = TypeTu;
        this.NameTu = NameTu;
        this.ZavTu = ZavTu;
        this.RegTu = RegTu;
        this.Mestorozhdenie = Mestorozhdenie;
        this.Obekt = Obekt;
        this.Skvazhina = Skvazhina;
        this.Ispolnenie = Ispolnenie;
    }

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getTypeTu() {
        return TypeTu;
    }
    public void setTypeTu(String TypeTu) {
        this.TypeTu = TypeTu;
    }
    public String getNameTu() {
        return NameTu;
    }
    public void setNameTu(String NameTu) {
        this.NameTu = NameTu;
    }
    public String getZavTu() {
        return ZavTu;
    }
    public void setZavTu(String ZavTu) {
        this.ZavTu = ZavTu;
    }
    public String getRegTu() {
        return RegTu;
    }
    public void setRegTu(String RegTu) {
        this.RegTu = RegTu;
    }
    public String getMestorozhdenie() {
        return Mestorozhdenie;
    }
    public void setMestorozhdenie(String Mestorozhdenie) {
        this.Mestorozhdenie = Mestorozhdenie;
    }
    public String getObekt() {
        return Obekt;
    }
    public void setObekt(String Obekt) {
        this.Obekt = Obekt;
    }
    public String getSkvazhina() {
        return Skvazhina;
    }
    public void setSkvazhina(String Skvazhina) {
        this.Skvazhina = Skvazhina;
    }
    public String getIspolnenie() {
        return Ispolnenie;
    }
    public void setIspolnenie(String Ispolnenie) {
        this.Ispolnenie = Ispolnenie;
    }

}