package uit.projectfinal.lap3_18520494.API;

import uit.projectfinal.lap3_18520494.Model.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {
    @GET("everything?q=tesla&from=2022-04-10&sortBy=publishedAt&apiKey=d9f20dfc50204b6cac20cccfeef1dbaa")
    Call<News> GetDataNews();

}
