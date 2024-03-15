
package org.openapitools.client.model


case class AudienceCategory (
    /* Interest unique key (same as ID). */
    _key: Option[String],
    /* Interest name. */
    _name: Option[String],
    /* Interest's percent of category's total audience. */
    _ratio: Option[Number],
    /* Interest affinity index. */
    _index: Option[Number],
    /* Interest ID. */
    _id: Option[String],
    /* Subcategory interest distribution */
    _subcategories: Option[List[AudienceSubcategory]]
)
object AudienceCategory {
    def toStringBody(var_key: Object, var_name: Object, var_ratio: Object, var_index: Object, var_id: Object, var_subcategories: Object) =
        s"""
        | {
        | "key":$var_key,"name":$var_name,"ratio":$var_ratio,"index":$var_index,"id":$var_id,"subcategories":$var_subcategories
        | }
        """.stripMargin
}
