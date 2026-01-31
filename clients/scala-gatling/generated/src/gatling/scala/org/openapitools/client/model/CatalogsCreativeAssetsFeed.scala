
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsCreativeAssetsFeed (
    _createdAt: OffsetDateTime,
    _id: String,
    _updatedAt: OffsetDateTime,
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    _catalogId: String,
    _catalogType: CatalogsType,
    _credentials: CatalogsFeedCredentials,
    _defaultCountry: Country,
    _defaultCurrency: NullableCurrency,
    /* The locale used within a feed for product descriptions. */
    _defaultLocale: String,
    _format: CatalogsFormat,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    /* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    _name: String,
    _preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
    _status: CatalogsStatus
)
object CatalogsCreativeAssetsFeed {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object, var_catalogId: Object, var_catalogType: Object, var_credentials: Object, var_defaultCountry: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_format: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt,"catalogId":$var_catalogId,"catalogType":$var_catalogType,"credentials":$var_credentials,"defaultCountry":$var_defaultCountry,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"format":$var_format,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status
        | }
        """.stripMargin
}
