
package org.openapitools.client.model


case class AudienceSubcategory (
    /* Interest unique key (same as ID). */
    _key: Option[String],
    /* Subinterest name. */
    _name: Option[String],
    /* Subinterest's percent of category's total audience. */
    _ratio: Option[Number],
    /* Subinterest affinity index. */
    _index: Option[Number],
    /* Subinterest ID. */
    _id: Option[String]
)
object AudienceSubcategory {
    def toStringBody(var_key: Object, var_name: Object, var_ratio: Object, var_index: Object, var_id: Object) =
        s"""
        | {
        | "key":$var_key,"name":$var_name,"ratio":$var_ratio,"index":$var_index,"id":$var_id
        | }
        """.stripMargin
}
