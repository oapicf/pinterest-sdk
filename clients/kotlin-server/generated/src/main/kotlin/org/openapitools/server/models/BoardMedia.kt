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
package org.openapitools.server.models


/**
 * Board media.
 * @param imageCoverUrl Board cover image.
 * @param pinThumbnailUrls Board pin thumbnail urls.
 */
data class BoardMedia(
    /* Board cover image. */
    val imageCoverUrl: kotlin.String? = null,
    /* Board pin thumbnail urls. */
    val pinThumbnailUrls: kotlin.collections.List<kotlin.String>? = null
) 
