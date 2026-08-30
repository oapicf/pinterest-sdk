
package org.openapitools.client.model


case class SchedulesList200Response (
    _bookmark: Option[String],
    _items: List[Schedule]
)
object SchedulesList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
