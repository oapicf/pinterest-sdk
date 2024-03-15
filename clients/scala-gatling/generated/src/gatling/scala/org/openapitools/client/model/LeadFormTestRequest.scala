
package org.openapitools.client.model


case class LeadFormTestRequest (
    /* Test lead answers. Should follow the creation order. */
    _answers: List[String]
)
object LeadFormTestRequest {
    def toStringBody(var_answers: Object) =
        s"""
        | {
        | "answers":$var_answers
        | }
        """.stripMargin
}
