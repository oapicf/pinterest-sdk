
package org.openapitools.client.model


case class BidOptionsAudienceMultipliers (
    _audienceId: String,
    _multiplier: Number
)
object BidOptionsAudienceMultipliers {
    def toStringBody(var_audienceId: Object, var_multiplier: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"multiplier":$var_multiplier
        | }
        """.stripMargin
}
