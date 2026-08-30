
package org.openapitools.client.model


case class CatalogsFeedCreateRequestSchema (
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    _catalogId: Option[String],
    _catalogType: String,
    _credentials: Option[CatalogsFeedCredentials],
    _defaultAvailability: Option[ProductAvailabilityType],
    _defaultCountry: Country,
    _defaultCurrency: Option[NullableCurrency],
    _defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
    _format: CatalogsFormat,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    /* A human-friendly name associated to a given feed. */
    _name: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: Option[CatalogsStatus]
)
object CatalogsFeedCreateRequestSchema {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_credentials: Object, var_defaultAvailability: Object, var_defaultCountry: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_format: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"credentials":$var_credentials,"defaultAvailability":$var_defaultAvailability,"defaultCountry":$var_defaultCountry,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"format":$var_format,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status
        | }
        """.stripMargin
}
