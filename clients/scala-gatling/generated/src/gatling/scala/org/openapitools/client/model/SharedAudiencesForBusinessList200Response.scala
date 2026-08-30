
package org.openapitools.client.model


case class SharedAudiencesForBusinessList200Response (
    _bookmark: Option[String],
    _items: List[Audience]
)
object SharedAudiencesForBusinessList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
