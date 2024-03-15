package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* The field types supported by the update mask
* Values: ad_link,adult,age_group,availability,average_review_rating,brand,checkout_enabled,color,condition,custom_label_0,custom_label_1,custom_label_2,custom_label_3,custom_label_4,description,free_shipping_label,free_shipping_limit,gender,google_product_category,gtin,item_group_id,last_updated_time,link,material,min_ad_price,mpn,number_of_ratings,number_of_reviews,pattern,price,product_type,sale_price,shipping,shipping_height,shipping_weight,shipping_width,size,size_system,size_type,tax,title,variant_names,variant_values
*/
enum class UpdateMaskFieldType(val value: kotlin.String) {

    @JsonProperty("ad_link") ad_link("ad_link"),
    @JsonProperty("adult") adult("adult"),
    @JsonProperty("age_group") age_group("age_group"),
    @JsonProperty("availability") availability("availability"),
    @JsonProperty("average_review_rating") average_review_rating("average_review_rating"),
    @JsonProperty("brand") brand("brand"),
    @JsonProperty("checkout_enabled") checkout_enabled("checkout_enabled"),
    @JsonProperty("color") color("color"),
    @JsonProperty("condition") condition("condition"),
    @JsonProperty("custom_label_0") custom_label_0("custom_label_0"),
    @JsonProperty("custom_label_1") custom_label_1("custom_label_1"),
    @JsonProperty("custom_label_2") custom_label_2("custom_label_2"),
    @JsonProperty("custom_label_3") custom_label_3("custom_label_3"),
    @JsonProperty("custom_label_4") custom_label_4("custom_label_4"),
    @JsonProperty("description") description("description"),
    @JsonProperty("free_shipping_label") free_shipping_label("free_shipping_label"),
    @JsonProperty("free_shipping_limit") free_shipping_limit("free_shipping_limit"),
    @JsonProperty("gender") gender("gender"),
    @JsonProperty("google_product_category") google_product_category("google_product_category"),
    @JsonProperty("gtin") gtin("gtin"),
    @JsonProperty("item_group_id") item_group_id("item_group_id"),
    @JsonProperty("last_updated_time") last_updated_time("last_updated_time"),
    @JsonProperty("link") link("link"),
    @JsonProperty("material") material("material"),
    @JsonProperty("min_ad_price") min_ad_price("min_ad_price"),
    @JsonProperty("mpn") mpn("mpn"),
    @JsonProperty("number_of_ratings") number_of_ratings("number_of_ratings"),
    @JsonProperty("number_of_reviews") number_of_reviews("number_of_reviews"),
    @JsonProperty("pattern") pattern("pattern"),
    @JsonProperty("price") price("price"),
    @JsonProperty("product_type") product_type("product_type"),
    @JsonProperty("sale_price") sale_price("sale_price"),
    @JsonProperty("shipping") shipping("shipping"),
    @JsonProperty("shipping_height") shipping_height("shipping_height"),
    @JsonProperty("shipping_weight") shipping_weight("shipping_weight"),
    @JsonProperty("shipping_width") shipping_width("shipping_width"),
    @JsonProperty("size") size("size"),
    @JsonProperty("size_system") size_system("size_system"),
    @JsonProperty("size_type") size_type("size_type"),
    @JsonProperty("tax") tax("tax"),
    @JsonProperty("title") title("title"),
    @JsonProperty("variant_names") variant_names("variant_names"),
    @JsonProperty("variant_values") variant_values("variant_values")
}

