
package org.openapitools.client.model


case class CatalogsHotelFeedsUpdateRequest (
    _catalogType: String,
    _credentials: Option[CatalogsFeedCredentials],
    _defaultCurrency: Option[NullableCurrency],
    _format: Option[CatalogsFormat],
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: Option[String],
    /* A human-friendly name associated to a given feed. */
    _name: Option[String],
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: Option[CatalogsStatus]
)
object CatalogsHotelFeedsUpdateRequest {
    def toStringBody(var_catalogType: Object, var_credentials: Object, var_defaultCurrency: Object, var_format: Object, var_location: Object, var_name: Object, var_preferredProcessingSchedule: Object, var_status: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"credentials":$var_credentials,"defaultCurrency":$var_defaultCurrency,"format":$var_format,"location":$var_location,"name":$var_name,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status
        | }
        """.stripMargin
}
