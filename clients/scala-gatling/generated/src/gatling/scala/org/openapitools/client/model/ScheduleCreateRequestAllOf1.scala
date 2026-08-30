
package org.openapitools.client.model


case class ScheduleCreateRequestAllOf1 (
    _entityId: String,
    /* Entity type */
    _entityType: String
)
object ScheduleCreateRequestAllOf1 {
    def toStringBody(var_entityId: Object, var_entityType: Object) =
        s"""
        | {
        | "entityId":$var_entityId,"entityType":$var_entityType
        | }
        """.stripMargin
}
