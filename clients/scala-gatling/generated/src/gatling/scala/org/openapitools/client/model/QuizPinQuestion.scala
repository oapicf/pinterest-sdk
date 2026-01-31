
package org.openapitools.client.model


case class QuizPinQuestion (
    _options: Option[List[QuizPinOption]],
    _questionId: Option[Number],
    _questionText: Option[String]
)
object QuizPinQuestion {
    def toStringBody(var_options: Object, var_questionId: Object, var_questionText: Object) =
        s"""
        | {
        | "options":$var_options,"questionId":$var_questionId,"questionText":$var_questionText
        | }
        """.stripMargin
}
