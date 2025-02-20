/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
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
 * @param key Interest unique key (same as ID).
 * @param name Subinterest name.
 * @param ratio Subinterest's percent of category's total audience.
 * @param index Subinterest affinity index.
 * @param id Subinterest ID.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AudienceSubcategory (
    /* Interest unique key (same as ID). */
    val key: kotlin.String? = null,
    /* Subinterest name. */
    val name: kotlin.String? = null,
    /* Subinterest's percent of category's total audience. */
    val ratio: java.math.BigDecimal? = null,
    /* Subinterest affinity index. */
    val index: java.math.BigDecimal? = null,
    /* Subinterest ID. */
    val id: kotlin.String? = null
) {

}

