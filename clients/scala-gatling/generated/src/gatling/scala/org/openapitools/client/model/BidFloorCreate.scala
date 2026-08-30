
package org.openapitools.client.model


case class BidFloorCreate (
    /* List of bid floor specifications. */
    _bidFloorSpecs: List[BidFloorSpec],
    /* Ad group targeting specification defining the ad group target audience. */
    _targetingSpec: Option[TargetingSpecOptimal]
)
object BidFloorCreate {
    def toStringBody(var_bidFloorSpecs: Object, var_targetingSpec: Object) =
        s"""
        | {
        | "bidFloorSpecs":$var_bidFloorSpecs,"targetingSpec":$var_targetingSpec
        | }
        """.stripMargin
}
