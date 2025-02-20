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
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsType
import org.openapitools.server.models.ItemValidationEvent

/**
 * Object describing a creative assets item error
 * @param catalogType 
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
data class CatalogsCreativeAssetsItemErrorResponse(
    val catalogType: CatalogsType,
    /* The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String? = null,
    /* Array with the errors for the item id requested */
    val errors: kotlin.collections.List<ItemValidationEvent>? = null
) 

