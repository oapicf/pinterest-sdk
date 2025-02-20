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

import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Request object for updating a product group.
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CatalogsProductGroupUpdateRequest (
    val name: kotlin.String? = null,
    val description: kotlin.String? = null,
    /* boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null,
    val filters: CatalogsProductGroupFiltersRequest? = null
) {

}

