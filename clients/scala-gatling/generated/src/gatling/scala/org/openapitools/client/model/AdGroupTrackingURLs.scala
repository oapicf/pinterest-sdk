
package org.openapitools.client.model


case class AdGroupTrackingURLs (
    _audienceVerification: Option[List[String]],
    _buyableButton: Option[List[String]],
    _click: Option[List[String]],
    _engagement: Option[List[String]],
    _impression: Option[List[String]]
)
object AdGroupTrackingURLs {
    def toStringBody(var_audienceVerification: Object, var_buyableButton: Object, var_click: Object, var_engagement: Object, var_impression: Object) =
        s"""
        | {
        | "audienceVerification":$var_audienceVerification,"buyableButton":$var_buyableButton,"click":$var_click,"engagement":$var_engagement,"impression":$var_impression
        | }
        """.stripMargin
}
