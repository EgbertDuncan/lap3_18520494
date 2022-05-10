package uit.projectfinal.lap3_18520494.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalResults")
    @Expose
    private Integer totalResults;
    @SerializedName("articles")
    @Expose
    private List<uit.projectfinal.lap3_18520494.Model.Article> articles = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<uit.projectfinal.lap3_18520494.Model.Article> getArticles() {
        return articles;
    }

    public void setArticles(List<uit.projectfinal.lap3_18520494.Model.Article> articles) {
        this.articles = articles;
    }

}