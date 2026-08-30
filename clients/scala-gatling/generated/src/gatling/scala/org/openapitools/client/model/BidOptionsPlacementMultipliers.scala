
package org.openapitools.client.model


case class BidOptionsPlacementMultipliers (
    _browse: Option[Number],
    _relatedPins: Option[Number],
    _search: Option[Number]
)
object BidOptionsPlacementMultipliers {
    def toStringBody(var_browse: Object, var_relatedPins: Object, var_search: Object) =
        s"""
        | {
        | "browse":$var_browse,"relatedPins":$var_relatedPins,"search":$var_search
        | }
        """.stripMargin
}
