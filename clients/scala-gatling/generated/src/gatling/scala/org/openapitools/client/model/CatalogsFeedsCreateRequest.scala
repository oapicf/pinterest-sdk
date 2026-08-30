
package org.openapitools.client.model


case class CatalogsFeedsCreateRequest (
    _credentials: Option[CatalogsFeedCredentials],
    _defaultAvailability: Option[ProductAvailabilityType],
    _defaultCountry: Option[Country],
    _defaultCurrency: Option[NullableCurrency],
    _defaultLocale: Option[CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale],
    _format: CatalogsFormat,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    /* A human-friendly name associated to a given feed. */
    _name: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: Option[CatalogsStatus]
)
object CatalogsFeedsCreateRequest {
    def toStringBody(var_credentials: Object, var_defaultAvailability: Object, var_defaultCountry: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_format: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object) =
        s"""
        | {
        | "credentials":$var_credentials,"defaultAvailability":$var_defaultAvailability,"defaultCountry":$var_defaultCountry,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"format":$var_format,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status
        | }
        """.stripMargin
}
