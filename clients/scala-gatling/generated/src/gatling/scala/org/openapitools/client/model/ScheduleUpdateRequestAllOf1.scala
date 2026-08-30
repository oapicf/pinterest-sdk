
package org.openapitools.client.model


case class ScheduleUpdateRequestAllOf1 (
    _entityId: Option[String],
    /* Entity type */
    _entityType: Option[String],
    /* Schedule ID. */
    _id: String
)
object ScheduleUpdateRequestAllOf1 {
    def toStringBody(var_entityId: Object, var_entityType: Object, var_id: Object) =
        s"""
        | {
        | "entityId":$var_entityId,"entityType":$var_entityType,"id":$var_id
        | }
        """.stripMargin
}
