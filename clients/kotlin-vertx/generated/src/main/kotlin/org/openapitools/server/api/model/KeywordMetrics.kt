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
 * Keyword metrics JSON
 * @param avgCpcInMicroCurrency Average cost per click
 * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class KeywordMetrics (
    /* Average cost per click */
    val avgCpcInMicroCurrency: java.math.BigDecimal? = null,
    /* Keyword's search frequency. This value is based on keyword frequency in pepsi client response */
    val keywordQueryVolume: kotlin.String? = null
) {

}
