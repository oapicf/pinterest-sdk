/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CatalogsFeedIngestionDetails
import org.openapitools.server.models.CatalogsFeedProcessingStatus
import org.openapitools.server.models.CatalogsFeedProductCounts
import org.openapitools.server.models.CatalogsFeedValidationDetails

/**
 * 
 * @param ingestionDetails 
 * @param status 
 * @param productCounts 
 * @param validationDetails 
 */
data class CatalogsFeedProcessingResultFields(
    val ingestionDetails: CatalogsFeedIngestionDetails,
    val status: CatalogsFeedProcessingStatus,
    val productCounts: CatalogsFeedProductCounts,
    val validationDetails: CatalogsFeedValidationDetails
) 
