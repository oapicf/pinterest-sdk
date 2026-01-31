
package org.openapitools.client.model


case class Label (
    /* Label ID. */
    _id: Option[String],
    _labelType: Option[LabelType],
    /* Label parent entity ID. */
    _parentId: Option[String],
    /* Label parent entity type. */
    _parentType: Option[String],
    _status: Option[LabelStatus],
    /* Label name. */
    _value: Option[String]
)
object Label {
    def toStringBody(var_id: Object, var_labelType: Object, var_parentId: Object, var_parentType: Object, var_status: Object, var_value: Object) =
        s"""
        | {
        | "id":$var_id,"labelType":$var_labelType,"parentId":$var_parentId,"parentType":$var_parentType,"status":$var_status,"value":$var_value
        | }
        """.stripMargin
}
