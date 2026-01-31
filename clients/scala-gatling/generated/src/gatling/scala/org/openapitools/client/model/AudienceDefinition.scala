
package org.openapitools.client.model


case class AudienceDefinition (
    /* Generation date */
    _date: Option[String],
    _scope: Option[String],
    _type: Option[String]
)
object AudienceDefinition {
    def toStringBody(var_date: Object, var_scope: Object, var_type: Object) =
        s"""
        | {
        | "date":$var_date,"scope":$var_scope,"type":$var_type
        | }
        """.stripMargin
}
