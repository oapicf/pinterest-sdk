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

import org.openapitools.server.models.AudienceDemographicValue

/**
 * Audience demographics
 * @param ages Ages distribution.
 * @param genders Gender distribution.
 * @param devices Device usage distribution.
 * @param metros Geographic metro area distribution.
 * @param countries Country area distribution.
 */
data class AudienceDemographics(
    /* Ages distribution. */
    val ages: kotlin.collections.List<AudienceDemographicValue>? = null,
    /* Gender distribution. */
    val genders: kotlin.collections.List<AudienceDemographicValue>? = null,
    /* Device usage distribution. */
    val devices: kotlin.collections.List<AudienceDemographicValue>? = null,
    /* Geographic metro area distribution. */
    val metros: kotlin.collections.List<AudienceDemographicValue>? = null,
    /* Country area distribution. */
    val countries: kotlin.collections.List<AudienceDemographicValue>? = null
) 

