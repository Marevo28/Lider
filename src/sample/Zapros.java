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
    public void SendSpisokBND20(String Ispolnenie, String Factshurf, String Actshurf, String Luklaz, String Naryad, String Ostanov,String iskluchenie, String OstanovStart, String OstanovEnd, String databeznk,
                                String dataactnegot, String dataactnodoc, String datank,String SelectedPersBezNK,String SelectedPersNK,String prichinaiskluchenia,String defects,String primechanie,
                                String defctsvedomost, String SelectedExpNote,String SelectedPersNote) {
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        // один параметр, если нужно два и более просто добоовляем также
        nameValuePairs.add(new BasicNameValuePair("position", Ispolnenie));
        nameValuePairs.add(new BasicNameValuePair("position", Factshurf));
        nameValuePairs.add(new BasicNameValuePair("position", Actshurf));
        nameValuePairs.add(new BasicNameValuePair("position", Luklaz));
        nameValuePairs.add(new BasicNameValuePair("position", Naryad));
        nameValuePairs.add(new BasicNameValuePair("position", Ostanov));
        nameValuePairs.add(new BasicNameValuePair("position", OstanovStart));
        nameValuePairs.add(new BasicNameValuePair("position", OstanovEnd));
        nameValuePairs.add(new BasicNameValuePair("position", databeznk));
        nameValuePairs.add(new BasicNameValuePair("position", dataactnegot));
        nameValuePairs.add(new BasicNameValuePair("position", dataactnodoc));
        nameValuePairs.add(new BasicNameValuePair("position", datank));
        nameValuePairs.add(new BasicNameValuePair("position", SelectedPersBezNK));
        nameValuePairs.add(new BasicNameValuePair("position", SelectedPersNK));
        nameValuePairs.add(new BasicNameValuePair("position", prichinaiskluchenia));
        nameValuePairs.add(new BasicNameValuePair("position", defects));
        nameValuePairs.add(new BasicNameValuePair("position", primechanie));
        nameValuePairs.add(new BasicNameValuePair("position", defctsvedomost));
        nameValuePairs.add(new BasicNameValuePair("position", SelectedExpNote));
        nameValuePairs.add(new BasicNameValuePair("position", SelectedPersNote));

        HttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost("http://peremoga.tech/Desktop/DefectoscopistBND2020.php");
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

}
