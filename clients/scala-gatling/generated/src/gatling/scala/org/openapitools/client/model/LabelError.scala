
package org.openapitools.client.model


case class LabelError (
    _data: Option[LabelErrorData],
    _errorMessages: Option[List[String]]
)
object LabelError {
    def toStringBody(var_data: Object, var_errorMessages: Object) =
        s"""
        | {
        | "data":$var_data,"errorMessages":$var_errorMessages
        | }
        """.stripMargin
}
