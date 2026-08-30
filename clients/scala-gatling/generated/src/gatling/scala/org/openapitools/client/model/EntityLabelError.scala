
package org.openapitools.client.model


case class EntityLabelError (
    _data: Option[EntityLabel],
    _errorMessages: Option[List[String]]
)
object EntityLabelError {
    def toStringBody(var_data: Object, var_errorMessages: Object) =
        s"""
        | {
        | "data":$var_data,"errorMessages":$var_errorMessages
        | }
        """.stripMargin
}
