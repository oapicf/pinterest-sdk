
package org.openapitools.client.model


case class QuizPinData (
    _questions: Option[List[QuizPinQuestion]],
    _results: Option[List[QuizPinResult]]
)
object QuizPinData {
    def toStringBody(var_questions: Object, var_results: Object) =
        s"""
        | {
        | "questions":$var_questions,"results":$var_results
        | }
        """.stripMargin
}
