
package org.openapitools.client.model


case class BidOptionsAgeBucketMultipliers (
    _18_24: Option[Number],
    _25_34: Option[Number],
    _35_44: Option[Number],
    _45_49: Option[Number],
    _50_54: Option[Number],
    _55_64: Option[Number],
    _65: Option[Number]
)
object BidOptionsAgeBucketMultipliers {
    def toStringBody(var_18_24: Object, var_25_34: Object, var_35_44: Object, var_45_49: Object, var_50_54: Object, var_55_64: Object, var_65: Object) =
        s"""
        | {
        | "18_24":$var_18_24,"25_34":$var_25_34,"35_44":$var_35_44,"45_49":$var_45_49,"50_54":$var_50_54,"55_64":$var_55_64,"65":$var_65
        | }
        """.stripMargin
}
