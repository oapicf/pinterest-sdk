/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param name Metric's name.
 * @param category Category name
 * @param definition How the metric is defined.
 * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class DeliveryMetricsResponseItemsInner (
    /* Metric's name. */
    val name: kotlin.String? = null,
    /* Category name */
    val category: DeliveryMetricsResponseItemsInner.Category? = null,
    /* How the metric is defined. */
    val definition: kotlin.String? = null,
    /* Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    val displayName: kotlin.String? = null
) {

    /**
    * Category name
    * Values: ADS,ORGANIC
    */
    enum class Category(val value: kotlin.String){
    
        ADS("ADS"),
    
        ORGANIC("ORGANIC");
    
    }

}
