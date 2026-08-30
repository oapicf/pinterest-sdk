
package org.openapitools.client.model


case class BidOptionsGenderMultipliers (
    _female: Option[Number],
    _male: Option[Number]
)
object BidOptionsGenderMultipliers {
    def toStringBody(var_female: Object, var_male: Object) =
        s"""
        | {
        | "female":$var_female,"male":$var_male
        | }
        """.stripMargin
}
