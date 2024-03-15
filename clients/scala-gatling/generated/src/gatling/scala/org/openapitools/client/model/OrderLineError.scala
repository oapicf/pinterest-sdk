
package org.openapitools.client.model


case class OrderLineError (
    _data: Option[OrderLine],
    _errorMessages: Option[List[String]]
)
object OrderLineError {
    def toStringBody(var_data: Object, var_errorMessages: Object) =
        s"""
        | {
        | "data":$var_data,"errorMessages":$var_errorMessages
        | }
        """.stripMargin
}
