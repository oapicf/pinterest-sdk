
package org.openapitools.client.model


case class CatalogsHotelFeedsCreateRequest (
    _defaultCurrency: Option[NullableCurrency],
    /* A human-friendly name associated to a given feed. */
    _name: String,
    _format: CatalogsFormat,
    _defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
    _credentials: Option[CatalogsFeedCredentials],
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _catalogType: CatalogsType,
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. */
    _catalogId: Option[String],
    _status: Option[CatalogsStatus]
)
object CatalogsHotelFeedsCreateRequest {
    def toStringBody(var_defaultCurrency: Object, var_name: Object, var_format: Object, var_defaultLocale: Object, var_credentials: Object, var_location: Object, var_preferredProcessingSchedule: Object, var_catalogType: Object, var_catalogId: Object, var_status: Object) =
        s"""
        | {
        | "defaultCurrency":$var_defaultCurrency,"name":$var_name,"format":$var_format,"defaultLocale":$var_defaultLocale,"credentials":$var_credentials,"location":$var_location,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"catalogType":$var_catalogType,"catalogId":$var_catalogId,"status":$var_status
        | }
        """.stripMargin
}
