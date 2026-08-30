
package org.openapitools.client.model


case class ConversionEventResponse (
    /* Id of the ad account. */
    _adAccountId: Option[String],
    _conversionEvent: Option[ConversionTagType],
    /* Id of the tag. */
    _conversionTagId: Option[String],
    /* Creation date in epoch format. */
    _createdTime: Option[Integer],
    /* For advertiser-defined events, the reporting event label shown in optimization UIs. */
    _reportingConversionEvent: Option[String]
)
object ConversionEventResponse {
    def toStringBody(var_adAccountId: Object, var_conversionEvent: Object, var_conversionTagId: Object, var_createdTime: Object, var_reportingConversionEvent: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"conversionEvent":$var_conversionEvent,"conversionTagId":$var_conversionTagId,"createdTime":$var_createdTime,"reportingConversionEvent":$var_reportingConversionEvent
        | }
        """.stripMargin
}
