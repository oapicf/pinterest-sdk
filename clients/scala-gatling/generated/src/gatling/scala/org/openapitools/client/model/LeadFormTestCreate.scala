
package org.openapitools.client.model


case class LeadFormTestCreate (
    /* Test lead answers. Should follow the creation order. */
    _answers: List[String]
)
object LeadFormTestCreate {
    def toStringBody(var_answers: Object) =
        s"""
        | {
        | "answers":$var_answers
        | }
        """.stripMargin
}
