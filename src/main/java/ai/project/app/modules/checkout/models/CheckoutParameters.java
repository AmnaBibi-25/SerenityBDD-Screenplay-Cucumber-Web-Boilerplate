package ai.project.app.modules.checkout.models;

import com.google.gson.annotations.SerializedName;
import indexed.pojo.model.IndexedPojo;

import java.util.ArrayList;
import java.util.List;

public class CheckoutParameters extends IndexedPojo {

    public static final String PRODUCTS_KEY = "Products";
    @SerializedName(PRODUCTS_KEY)
    public List<String> products = new ArrayList<>();

    public static final String FIRSTNAME_KEY = "Firstname";
    @SerializedName(FIRSTNAME_KEY)
    public String firstname = "";

    public static final String LASTNAME_KEY = "Lastname";
    @SerializedName(LASTNAME_KEY)
    public String lastname = "";

    public static final String ZIPCODE_KEY = "Zip code";
    @SerializedName(ZIPCODE_KEY)
    public String zipcode = "";
}
