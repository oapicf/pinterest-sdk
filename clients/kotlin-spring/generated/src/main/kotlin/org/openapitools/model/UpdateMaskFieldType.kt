package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
enum class UpdateMaskFieldType(@get:JsonValue val value: kotlin.String) {

    ad_link("ad_link"),
    adult("adult"),
    age_group("age_group"),
    availability("availability"),
    average_review_rating("average_review_rating"),
    brand("brand"),
    checkout_enabled("checkout_enabled"),
    color("color"),
    condition("condition"),
    custom_label_0("custom_label_0"),
    custom_label_1("custom_label_1"),
    custom_label_2("custom_label_2"),
    custom_label_3("custom_label_3"),
    custom_label_4("custom_label_4"),
    description("description"),
    free_shipping_label("free_shipping_label"),
    free_shipping_limit("free_shipping_limit"),
    gender("gender"),
    google_product_category("google_product_category"),
    gtin("gtin"),
    item_group_id("item_group_id"),
    last_updated_time("last_updated_time"),
    link("link"),
    material("material"),
    min_ad_price("min_ad_price"),
    mpn("mpn"),
    number_of_ratings("number_of_ratings"),
    number_of_reviews("number_of_reviews"),
    pattern("pattern"),
    price("price"),
    product_type("product_type"),
    sale_price("sale_price"),
    shipping("shipping"),
    shipping_height("shipping_height"),
    shipping_weight("shipping_weight"),
    shipping_width("shipping_width"),
    size("size"),
    size_system("size_system"),
    size_type("size_type"),
    tax("tax"),
    title("title"),
    variant_names("variant_names"),
    variant_values("variant_values");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): UpdateMaskFieldType {
                return values().first{it -> it.value == value}
        }
    }
}

