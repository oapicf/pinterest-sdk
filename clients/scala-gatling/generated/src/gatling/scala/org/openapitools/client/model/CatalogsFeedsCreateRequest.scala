
package org.openapitools.client.model


case class CatalogsFeedsCreateRequest (
    _defaultCountry: Option[Country],
    _defaultAvailability: Option[ProductAvailabilityType],
    _defaultCurrency: Option[NullableCurrency],
    /* A human-friendly name associated to a given feed. */
    _name: String,
    _format: CatalogsFormat,
    /* The locale used within a feed for product descriptions. */
    _defaultLocale: Option[String],
    _credentials: Option[CatalogsFeedCredentials],
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule]
)
object CatalogsFeedsCreateRequest {
    def toStringBody(var_defaultCountry: Object, var_defaultAvailability: Object, var_defaultCurrency: Object, var_name: Object, var_format: Object, var_defaultLocale: Object, var_credentials: Object, var_location: Object, var_preferredProcessingSchedule: Object) =
        s"""
        | {
        | "defaultCountry":$var_defaultCountry,"defaultAvailability":$var_defaultAvailability,"defaultCurrency":$var_defaultCurrency,"name":$var_name,"format":$var_format,"defaultLocale":$var_defaultLocale,"credentials":$var_credentials,"location":$var_location,"preferredProcessingSchedule":$var_preferredProcessingSchedule
        | }
        """.stripMargin
}
