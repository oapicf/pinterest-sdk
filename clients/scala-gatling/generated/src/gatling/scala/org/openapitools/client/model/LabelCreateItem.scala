
package org.openapitools.client.model


case class LabelCreateItem (
    _labelType: LabelType,
    /* Label name. 100-character limit. */
    _value: String
)
object LabelCreateItem {
    def toStringBody(var_labelType: Object, var_value: Object) =
        s"""
        | {
        | "labelType":$var_labelType,"value":$var_value
        | }
        """.stripMargin
}
