
package org.openapitools.client.model


case class QuizPinQuestion (
    _questionId: Option[Number],
    _questionText: Option[String],
    _options: Option[List[QuizPinOption]]
)
object QuizPinQuestion {
    def toStringBody(var_questionId: Object, var_questionText: Object, var_options: Object) =
        s"""
        | {
        | "questionId":$var_questionId,"questionText":$var_questionText,"options":$var_options
        | }
        """.stripMargin
}
