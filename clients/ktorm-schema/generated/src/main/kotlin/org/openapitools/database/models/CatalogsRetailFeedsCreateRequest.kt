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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Request object for creating a retail feed.
 * @param name A human-friendly name associated to a given feed.
 * @param format 
 * @param defaultLocale 
 * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @param catalogType 
 * @param defaultCountry 
 * @param defaultCurrency 
 * @param credentials 
 * @param preferredProcessingSchedule 
 * @param defaultAvailability 
 */
object CatalogsRetailFeedsCreateRequests : BaseTable<CatalogsRetailFeedsCreateRequest>("CatalogsRetailFeedsCreateRequest") {
    val name = text("name") /* A human-friendly name associated to a given feed. */
    val format = long("format")
    val defaultLocale = long("default_locale")
    val location = text("location") /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    val catalogType = long("catalog_type")
    val defaultCountry = long("default_country")
    val defaultCurrency = long("default_currency") /* null */
    val credentials = long("credentials") /* null */
    val preferredProcessingSchedule = long("preferred_processing_schedule") /* null */
    val defaultAvailability = long("default_availability") /* null */

    /**
     * Create an entity of type CatalogsRetailFeedsCreateRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsRetailFeedsCreateRequest(
        name = row[name] ?: "" /* kotlin.String */ /* A human-friendly name associated to a given feed. */,
        format = CatalogsFormats.createEntity(row, withReferences) /* CatalogsFormat */,
        defaultLocale = CatalogsFeedsCreateRequestDefaultLocales.createEntity(row, withReferences) /* CatalogsFeedsCreateRequestDefaultLocale */,
        location = row[location] ?: "" /* kotlin.String */ /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */,
        catalogType = CatalogsTypes.createEntity(row, withReferences) /* CatalogsType */,
        defaultCountry = Countrys.createEntity(row, withReferences) /* Country */,
        defaultCurrency = NullableCurrencys.createEntity(row, withReferences) /* NullableCurrency? */,
        credentials = CatalogsFeedCredentialss.createEntity(row, withReferences) /* CatalogsFeedCredentials? */,
        preferredProcessingSchedule = CatalogsFeedProcessingSchedules.createEntity(row, withReferences) /* CatalogsFeedProcessingSchedule? */,
        defaultAvailability = ProductAvailabilityTypes.createEntity(row, withReferences) /* ProductAvailabilityType? */
    )

    /**
    * Assign all the columns from the entity of type CatalogsRetailFeedsCreateRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsRetailFeedsCreateRequest()
    * database.update(CatalogsRetailFeedsCreateRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsRetailFeedsCreateRequest) {
        this.apply {
            set(CatalogsRetailFeedsCreateRequests.name, entity.name)
            set(CatalogsRetailFeedsCreateRequests.format, entity.format)
            set(CatalogsRetailFeedsCreateRequests.defaultLocale, entity.defaultLocale)
            set(CatalogsRetailFeedsCreateRequests.location, entity.location)
            set(CatalogsRetailFeedsCreateRequests.catalogType, entity.catalogType)
            set(CatalogsRetailFeedsCreateRequests.defaultCountry, entity.defaultCountry)
            set(CatalogsRetailFeedsCreateRequests.defaultCurrency, entity.defaultCurrency)
            set(CatalogsRetailFeedsCreateRequests.credentials, entity.credentials)
            set(CatalogsRetailFeedsCreateRequests.preferredProcessingSchedule, entity.preferredProcessingSchedule)
            set(CatalogsRetailFeedsCreateRequests.defaultAvailability, entity.defaultAvailability)
        }
    }

}

