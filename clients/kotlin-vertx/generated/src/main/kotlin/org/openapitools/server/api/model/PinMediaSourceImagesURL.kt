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

import org.openapitools.server.api.model.PinMediaSourceImagesURLItemsInner

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Multiple images urls-based media source
 * @param items Array with image objects.
 * @param sourceType 
 * @param index 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class PinMediaSourceImagesURL (
    /* Array with image objects. */
    @SerializedName("items") private val _items: kotlin.Array<PinMediaSourceImagesURLItemsInner>?,
    val sourceType: PinMediaSourceImagesURL.SourceType? = null,
    val index: kotlin.Int? = null
) {

    /**
    * 
    * Values: multiple_image_urls
    */
    enum class SourceType(val value: kotlin.String){
    
        multiple_image_urls("multiple_image_urls");
    
    }

        val items get() = _items ?: throw IllegalArgumentException("items is required")
                    
}
