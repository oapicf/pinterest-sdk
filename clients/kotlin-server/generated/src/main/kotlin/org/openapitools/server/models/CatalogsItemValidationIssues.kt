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

import org.openapitools.server.models.CatalogsItemValidationErrors
import org.openapitools.server.models.CatalogsItemValidationWarnings

/**
 * 
 * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @param itemId The merchant-created unique ID that represents the product.
 * @param errors 
 * @param warnings 
 */
data class CatalogsItemValidationIssues(
    /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
    val itemNumber: kotlin.Int,
    /* The merchant-created unique ID that represents the product. */
    val itemId: kotlin.String,
    val errors: CatalogsItemValidationErrors,
    val warnings: CatalogsItemValidationWarnings
) 
