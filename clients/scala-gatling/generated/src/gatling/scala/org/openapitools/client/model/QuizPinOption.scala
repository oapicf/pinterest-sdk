
package org.openapitools.client.model


case class QuizPinOption (
    _id: Option[Number],
    _text: Option[String]
)
object QuizPinOption {
    def toStringBody(var_id: Object, var_text: Object) =
        s"""
        | {
        | "id":$var_id,"text":$var_text
        | }
        """.stripMargin
}
