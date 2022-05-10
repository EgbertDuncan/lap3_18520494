package uit.projectfinal.lap3_18520494.API;

public class Service {

    private static final String base_url = "https://newsapi.org/v2/";

    public static DataService getService() {
        return RetrofitClient.getClient(base_url).create(DataService.class);
    }
}
