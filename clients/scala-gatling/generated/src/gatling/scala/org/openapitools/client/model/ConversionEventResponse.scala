
package org.openapitools.client.model


case class ConversionEventResponse (
    _conversionEvent: Option[ConversionTagType],
    /* Id of the tag. */
    _conversionTagId: Option[String],
    /* Id of the ad account. */
    _adAccountId: Option[String],
    /* Creation date in epoch format. */
    _createdTime: Option[Integer]
)
object ConversionEventResponse {
    def toStringBody(var_conversionEvent: Object, var_conversionTagId: Object, var_adAccountId: Object, var_createdTime: Object) =
        s"""
        | {
        | "conversionEvent":$var_conversionEvent,"conversionTagId":$var_conversionTagId,"adAccountId":$var_adAccountId,"createdTime":$var_createdTime
        | }
        """.stripMargin
}
