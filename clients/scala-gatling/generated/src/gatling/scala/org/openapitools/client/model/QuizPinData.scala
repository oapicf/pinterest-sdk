
package org.openapitools.client.model


case class QuizPinData (
    _questions: Option[List[QuizPinQuestion]],
    _results: Option[List[QuizPinResult]],
    /* Quiz ad tie breaker type, default is RANDOM */
    _tieBreakerType: Option[String],
    _tieBreakerCustomResult: Option[QuizPinResult]
)
object QuizPinData {
    def toStringBody(var_questions: Object, var_results: Object, var_tieBreakerType: Object, var_tieBreakerCustomResult: Object) =
        s"""
        | {
        | "questions":$var_questions,"results":$var_results,"tieBreakerType":$var_tieBreakerType,"tieBreakerCustomResult":$var_tieBreakerCustomResult
        | }
        """.stripMargin
}
