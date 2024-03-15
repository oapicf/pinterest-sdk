
package org.openapitools.client.model


case class BidFloorRequest (
    _bidFloorSpecs: List[BidFloorSpec],
    _targetingSpec: Option[TargetingSpec]
)
object BidFloorRequest {
    def toStringBody(var_bidFloorSpecs: Object, var_targetingSpec: Object) =
        s"""
        | {
        | "bidFloorSpecs":$var_bidFloorSpecs,"targetingSpec":$var_targetingSpec
        | }
        """.stripMargin
}
