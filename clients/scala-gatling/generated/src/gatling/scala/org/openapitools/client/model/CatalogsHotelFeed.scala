
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsHotelFeed (
    _createdAt: OffsetDateTime,
    _id: String,
    _updatedAt: OffsetDateTime,
    /* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    _name: String,
    _format: CatalogsFormat,
    _catalogType: CatalogsType,
    _credentials: CatalogsFeedCredentials,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    _preferredProcessingSchedule: CatalogsFeedProcessingSchedule,
    _status: CatalogsStatus,
    _defaultCurrency: NullableCurrency,
    /* The locale used within a feed for product descriptions. */
    _defaultLocale: String,
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    _catalogId: String
)
object CatalogsHotelFeed {
    def toStringBody(var_createdAt: Object, var_id: Object, var_updatedAt: Object, var_name: Object, var_format: Object, var_catalogType: Object, var_credentials: Object, var_location: Object, var_preferredProcessingSchedule: Object, var_status: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_catalogId: Object) =
        s"""
        | {
        | "createdAt":$var_createdAt,"id":$var_id,"updatedAt":$var_updatedAt,"name":$var_name,"format":$var_format,"catalogType":$var_catalogType,"credentials":$var_credentials,"location":$var_location,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"catalogId":$var_catalogId
        | }
        """.stripMargin
}
