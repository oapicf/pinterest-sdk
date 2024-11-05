
package org.openapitools.client.model


case class CatalogsCreativeAssetsFeedsUpdateRequest (
    _defaultCurrency: Option[NullableCurrency],
    /* A human-friendly name associated to a given feed. */
    _name: Option[String],
    _format: Option[CatalogsFormat],
    _credentials: Option[CatalogsFeedCredentials],
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    _location: Option[String],
    _preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
    _status: Option[CatalogsStatus],
    _catalogType: CatalogsType
)
object CatalogsCreativeAssetsFeedsUpdateRequest {
    def toStringBody(var_defaultCurrency: Object, var_name: Object, var_format: Object, var_credentials: Object, var_location: Object, var_preferredProcessingSchedule: Object, var_status: Object, var_catalogType: Object) =
        s"""
        | {
        | "defaultCurrency":$var_defaultCurrency,"name":$var_name,"format":$var_format,"credentials":$var_credentials,"location":$var_location,"preferredProcessingSchedule":$var_preferredProcessingSchedule,"status":$var_status,"catalogType":$var_catalogType
        | }
        """.stripMargin
}
