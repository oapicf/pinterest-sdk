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

import org.openapitools.server.models.BatchOperationStatus
import org.openapitools.server.models.CatalogsHotelItemsBatch
import org.openapitools.server.models.CatalogsRetailItemsBatch
import org.openapitools.server.models.CatalogsType
import org.openapitools.server.models.HotelProcessingRecord

/**
 * Object describing the catalogs items batch
 * @param catalogType 
 * @param batchId Id of the catalogs items batch
 * @param createdTime Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param completedTime Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param status 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */
data class CatalogsItemsBatch(
    val catalogType: CatalogsType,
    /* Id of the catalogs items batch */
    val batchId: kotlin.String? = null,
    /* Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD */
    val createdTime: java.time.OffsetDateTime? = null,
    /* Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD */
    val completedTime: java.time.OffsetDateTime? = null,
    val status: BatchOperationStatus? = null,
    /* Array with the catalogs items processing records part of the catalogs items batch */
    val items: kotlin.collections.List<HotelProcessingRecord>? = null
) 
{
}
