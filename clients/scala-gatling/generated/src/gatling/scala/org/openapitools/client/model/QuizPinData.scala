
package org.openapitools.client.model


case class QuizPinData (
    _questions: Option[List[QuizPinQuestion]],
    _results: Option[List[QuizPinResult]],
    _tieBreakerCustomResult: Option[QuizPinResult],
    /* Quiz ad tie breaker type, default is RANDOM */
    _tieBreakerType: Option[String]
)
object QuizPinData {
    def toStringBody(var_questions: Object, var_results: Object, var_tieBreakerCustomResult: Object, var_tieBreakerType: Object) =
        s"""
        | {
        | "questions":$var_questions,"results":$var_results,"tieBreakerCustomResult":$var_tieBreakerCustomResult,"tieBreakerType":$var_tieBreakerType
        | }
        """.stripMargin
}
