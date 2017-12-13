package blog.praveendeshmane.co.in.rxjavaandretrofitwithjsonexample;

/**
 * Created by Admin on 07-12-2017.
 */

import java.util.List;


import retrofit2.http.GET;
import rx.Observable;

public interface APIService {


    @GET("/json")
    Observable<List<ProductModel>> getproductdata();

}