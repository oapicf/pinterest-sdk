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

import org.openapitools.server.api.model.ImageMetadataImages
import org.openapitools.server.api.model.PinMedia

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Pin with video.
 * @param images 
 * @param coverImageUrl 
 * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class PinMediaWithVideo (
    val images: ImageMetadataImages? = null,
    val coverImageUrl: kotlin.String? = null,
    /* Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
    val videoUrl: kotlin.String? = null,
    /* Duration (in milliseconds) */
    val duration: java.math.BigDecimal? = null,
    /* Height (in pixels) */
    val height: kotlin.Int? = null,
    /* Width (in pixels) */
    val width: kotlin.Int? = null,
    val mediaType: kotlin.String? = null
) {

}
