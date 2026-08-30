
package org.openapitools.client.model


case class AiDisclosures (
    /* List of AI disclosure declarations the creator has made about this Pin. */
    _values: List[AiDisclosureItem]
)
object AiDisclosures {
    def toStringBody(var_values: Object) =
        s"""
        | {
        | "values":$var_values
        | }
        """.stripMargin
}
