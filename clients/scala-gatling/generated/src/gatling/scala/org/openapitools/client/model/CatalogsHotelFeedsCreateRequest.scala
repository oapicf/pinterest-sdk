
package org.openapitools.client.model


case class CatalogsHotelFeedsCreateRequest (
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. */
    _catalogId: Option[String],
    _catalogType: CatalogsType,
    _credentials: Option[CatalogsFeedCredentials],
    _defaultCurrency: Option[NullableCurrency],
    _defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
    _format: CatalogsFormat,
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: String,
    /* A human-friendly name associated to a given feed. */
    _name: String,
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: Option[CatalogsStatus]
)
object CatalogsHotelFeedsCreateRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_credentials: Object, var_defaultCurrency: Object, var_defaultLocale: Object, var_format: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"credentials":$var_credentials,"defaultCurrency":$var_defaultCurrency,"defaultLocale":$var_defaultLocale,"format":$var_format,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status
        | }
        """.stripMargin
}
