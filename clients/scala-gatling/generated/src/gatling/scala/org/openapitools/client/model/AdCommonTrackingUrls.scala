
package org.openapitools.client.model


case class AdCommonTrackingUrls (
    _impression: Option[List[String]],
    _click: Option[List[String]],
    _engagement: Option[List[String]],
    _buyableButton: Option[List[String]],
    _audienceVerification: Option[List[String]]
)
object AdCommonTrackingUrls {
    def toStringBody(var_impression: Object, var_click: Object, var_engagement: Object, var_buyableButton: Object, var_audienceVerification: Object) =
        s"""
        | {
        | "impression":$var_impression,"click":$var_click,"engagement":$var_engagement,"buyableButton":$var_buyableButton,"audienceVerification":$var_audienceVerification
        | }
        """.stripMargin
}
