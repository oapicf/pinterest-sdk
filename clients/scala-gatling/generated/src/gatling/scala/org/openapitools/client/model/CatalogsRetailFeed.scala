
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsRetailFeed (
    _catalogType: String,
    _createdAt: OffsetDateTime,
    _credentials: Option[CatalogsFeedCredentials],
    _defaultAvailability: Option[ProductAvailabilityType],
    _defaultCountry: Country,
    _defaultCurrency: Option[NullableCurrency],
    /* The locale used within a feed for product descriptions. */
    _defaultLocale: String,
    _format: CatalogsFormat,
    /* ID of the feed entity. */
    _id: String,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    /* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    _name: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: CatalogsStatus,
    _updatedAt: OffsetDateTime
)
object CatalogsRetailFeed {
    def toStringBody(var_catalogType: Object, var_createdAt: Object, var_credentials: Object, var_defaultAvailability: Object, var_defaultCountry: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_format: Object, var_id: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object, var_updatedAt: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"createdAt":$var_createdAt,"credentials":$var_credentials,"defaultAvailability":$var_defaultAvailability,"defaultCountry":$var_defaultCountry,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"format":$var_format,"id":$var_id,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
