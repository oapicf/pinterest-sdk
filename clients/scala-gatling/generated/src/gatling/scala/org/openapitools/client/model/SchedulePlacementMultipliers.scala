
package org.openapitools.client.model


case class SchedulePlacementMultipliers (
    /* Browse (home-feed and related surfaces) */
    _browse: Option[Double],
    /* Related-Pins placement */
    _relatedPins: Option[Double],
    /* Search placement */
    _search: Option[Double]
)
object SchedulePlacementMultipliers {
    def toStringBody(var_browse: Object, var_relatedPins: Object, var_search: Object) =
        s"""
        | {
        | "browse":$var_browse,"relatedPins":$var_relatedPins,"search":$var_search
        | }
        """.stripMargin
}
