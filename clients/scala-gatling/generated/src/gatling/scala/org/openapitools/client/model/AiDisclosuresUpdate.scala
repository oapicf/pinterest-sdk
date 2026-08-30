
package org.openapitools.client.model


case class AiDisclosuresUpdate (
    /* List of AI disclosure declarations the creator has made about this Pin. */
    _values: Option[List[AiDisclosureItem]]
)
object AiDisclosuresUpdate {
    def toStringBody(var_values: Object) =
        s"""
        | {
        | "values":$var_values
        | }
        """.stripMargin
}
