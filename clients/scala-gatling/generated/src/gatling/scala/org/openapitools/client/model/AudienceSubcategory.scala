
package org.openapitools.client.model


case class AudienceSubcategory (
    /* Subinterest ID. */
    _id: Option[String],
    /* Subinterest affinity index. */
    _index: Option[Number],
    /* Interest unique key (same as ID). */
    _key: Option[String],
    /* Subinterest name. */
    _name: Option[String],
    /* Subinterest's percent of category's total audience. */
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
