
package org.openapitools.client.model


case class AudienceSubcategory (
    _id: Option[String],
    _index: Option[Number],
    _key: Option[String],
    _name: Option[String],
    _ratio: Option[Number]
)
object AudienceSubcategory {
    def toStringBody(var_id: Object, var_index: Object, var_key: Object, var_name: Object, var_ratio: Object) =
        s"""
        | {
        | "id":$var_id,"index":$var_index,"key":$var_key,"name":$var_name,"ratio":$var_ratio
        | }
        """.stripMargin
}
