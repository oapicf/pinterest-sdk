
package org.openapitools.client.model


case class AudienceDefinition (
    /* Generation date */
    _date: Option[String],
    /* Generated audience type to request. */
    _type: Option[String],
    /* Generated audience scope to request. */
    _scope: Option[String]
)
object AudienceDefinition {
    def toStringBody(var_date: Object, var_type: Object, var_scope: Object) =
        s"""
        | {
        | "date":$var_date,"type":$var_type,"scope":$var_scope
        | }
        """.stripMargin
}
