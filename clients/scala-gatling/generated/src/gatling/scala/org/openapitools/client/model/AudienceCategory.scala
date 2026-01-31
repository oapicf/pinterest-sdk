
package org.openapitools.client.model


case class AudienceCategory (
    /* Interest ID. */
    _id: Option[String],
    /* Interest affinity index. */
    _index: Option[Number],
    /* Interest unique key (same as ID). */
    _key: Option[String],
    /* Interest name. */
    _name: Option[String],
    /* Interest's percent of category's total audience. */
    _ratio: Option[Number],
    /* Subcategory interest distribution */
    _subcategories: Option[List[AudienceSubcategory]]
)
object AudienceCategory {
    def toStringBody(var_id: Object, var_index: Object, var_key: Object, var_name: Object, var_ratio: Object, var_subcategories: Object) =
        s"""
        | {
        | "id":$var_id,"index":$var_index,"key":$var_key,"name":$var_name,"ratio":$var_ratio,"subcategories":$var_subcategories
        | }
        """.stripMargin
}
