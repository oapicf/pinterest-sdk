
package org.openapitools.client.model


case class KeywordError (
    _data: Option[Keyword],
    _errorMessages: Option[List[String]]
)
object KeywordError {
    def toStringBody(var_data: Object, var_errorMessages: Object) =
        s"""
        | {
        | "data":$var_data,"errorMessages":$var_errorMessages
        | }
        """.stripMargin
}
