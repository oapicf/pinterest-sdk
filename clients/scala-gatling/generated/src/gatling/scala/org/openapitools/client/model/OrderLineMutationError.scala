
package org.openapitools.client.model


case class OrderLineMutationError (
    _data: Option[OrderLine],
    /* Error messages. */
    _errorMessages: Option[List[String]]
)
object OrderLineMutationError {
    def toStringBody(var_data: Object, var_errorMessages: Object) =
        s"""
        | {
        | "data":$var_data,"errorMessages":$var_errorMessages
        | }
        """.stripMargin
}
