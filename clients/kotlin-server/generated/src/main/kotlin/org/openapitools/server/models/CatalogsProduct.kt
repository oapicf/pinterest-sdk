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

import org.openapitools.server.models.CatalogsCreativeAssetsProduct
import org.openapitools.server.models.CatalogsCreativeAssetsProductMetadata
import org.openapitools.server.models.CatalogsHotelProduct
import org.openapitools.server.models.CatalogsRetailProduct
import org.openapitools.server.models.CatalogsType
import org.openapitools.server.models.Pin

/**
 * Catalogs product for all verticals
 * @param catalogType 
 * @param metadata 
 * @param pin 
 */
data class CatalogsProduct(
    val catalogType: CatalogsType,
    val metadata: CatalogsCreativeAssetsProductMetadata,
    val pin: Pin
) 
{
}

