package sample;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.util.ArrayList;

public class Zapros {
    InputStream is = null;
    String line = null;
    String result = null;

   public String Position;
   public String TypeTu;
   public String NameTu;
   public String ZavTu;
   public String RegTu;
   public String Mestorozhdenie;
   public String Obekt;
   public String Skvazhina;

    public void PoiskPoNomeru(String nomerzakl) {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        // один параметр, если нужно два и более просто добоовляем также
        nameValuePairs.add(new BasicNameValuePair("nomerzakl", nomerzakl));
        HttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost("http://peremoga.tech/Desktop/Lider-desktop-Json.php");
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();

        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"), 8);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n"); }
            is.close();
            result = sb.toString();
        } catch (Exception e) { e.printStackTrace();
        }
        try {
            JSONObject json_data = new JSONObject(result);
            String position = (json_data.getString("position"));
        } catch (Exception e) { e.printStackTrace();
        }
    }
    public void PoiskPoSkvoznomu(String position, String zakazchik) {
        String url = null;
        switch (zakazchik) {
            case "Башнефть 2020":
                url = "http://peremoga.tech/Desktop/DefectoscopistBND2020.php";
                break;
            case "Мегион 2020":
                url = "http://peremoga.tech/Desktop/DefectoscopistMNG2020.php";
                break;
            default:url ="Башнефть 2020";
        }
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        // один параметр, если нужно два и более просто добоовляем также
        nameValuePairs.add(new BasicNameValuePair("position", position));
        HttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost(url);
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"), 8);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n"); }
            is.close();
            result = sb.toString();
            System.out.println(result);
        } catch (Exception e) { e.printStackTrace();

        }
        try {
            JSONObject json_data = new JSONObject(result);
            Position = json_data.getString("position");
            TypeTu = json_data.getString("TypeTu");
            NameTu = json_data.getString("NameTu");
            ZavTu = json_data.getString("ZavTu");
            RegTu = json_data.getString("RegTu");
            Mestorozhdenie = json_data.getString("Mestorozhdenie");
            Obekt = json_data.getString("Obekt");
            Skvazhina = json_data.getString("Skvazhina");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void SendSpisokBND20(String position, String datanoteexp,String  SelectedExpNote,String  datanotepers,String  SelectedPersNote, String  Ispolnenie,String  Factshurf,String  Actshurf, String luklaz, String Naryad,
                                String Ostanov,String  ostanovstart, String ostanovend, String osmotr, String databeznk, String SelectedPersBezNK, String dataactnegot, String dataactnodoc, String datank,
                                String SelectedPersNK,String documents,String defects, String defctsvedomost,String primechanie,String  iskluchenie,String prichinaiskluchenia) {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        // один параметр, если нужно два и более просто добоовляем также
        nameValuePairs.add(new BasicNameValuePair("position", position));
        nameValuePairs.add(new BasicNameValuePair("stolb27", datanoteexp));
        nameValuePairs.add(new BasicNameValuePair("stolb28", SelectedExpNote));
        nameValuePairs.add(new BasicNameValuePair("stolb29", datanotepers));
        nameValuePairs.add(new BasicNameValuePair("stolb30", SelectedPersNote));
        nameValuePairs.add(new BasicNameValuePair("stolb31", Ispolnenie));
        nameValuePairs.add(new BasicNameValuePair("stolb32", Factshurf));
        nameValuePairs.add(new BasicNameValuePair("stolb33", Actshurf));
        nameValuePairs.add(new BasicNameValuePair("stolb34", luklaz));
        nameValuePairs.add(new BasicNameValuePair("stolb35", Naryad));
        nameValuePairs.add(new BasicNameValuePair("stolb36", Ostanov));
        nameValuePairs.add(new BasicNameValuePair("stolb37", ostanovstart));
        nameValuePairs.add(new BasicNameValuePair("stolb38", ostanovend));
        nameValuePairs.add(new BasicNameValuePair("stolb39", osmotr));
        //nameValuePairs.add(new BasicNameValuePair("stolb40", )); Планирование
        //nameValuePairs.add(new BasicNameValuePair("stolb41", )); Планирование
        nameValuePairs.add(new BasicNameValuePair("stolb42", databeznk));
        nameValuePairs.add(new BasicNameValuePair("stolb43", SelectedPersBezNK));
        nameValuePairs.add(new BasicNameValuePair("stolb44", dataactnegot));
        nameValuePairs.add(new BasicNameValuePair("stolb45", dataactnodoc));
        nameValuePairs.add(new BasicNameValuePair("stolb46", datank));
        nameValuePairs.add(new BasicNameValuePair("stolb47", SelectedPersNK));
        nameValuePairs.add(new BasicNameValuePair("stolb48", documents));
        nameValuePairs.add(new BasicNameValuePair("stolb49", defects));
        nameValuePairs.add(new BasicNameValuePair("stolb50", defctsvedomost));
        nameValuePairs.add(new BasicNameValuePair("stolb51", primechanie));
        nameValuePairs.add(new BasicNameValuePair("stolb52", iskluchenie));
        nameValuePairs.add(new BasicNameValuePair("stolb53", prichinaiskluchenia));

        HttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost("http://peremoga.tech/Android/DefectBND2020.php");
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"), 8);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n"); }
            is.close();
            result = sb.toString();
            System.out.printf(result);
        } catch (Exception e) { e.printStackTrace();

        }
        try {
           // JSONObject json_data = new JSONObject(result);
           // Position = json_data.getString("position");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
