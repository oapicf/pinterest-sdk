
package org.openapitools.client.model


case class AudienceInsightCategoryCommon (
    _key: Option[String],
    _name: Option[String],
    _ratio: Option[Number],
    _index: Option[Number],
    _id: Option[String]
)
object AudienceInsightCategoryCommon {
    def toStringBody(var_key: Object, var_name: Object, var_ratio: Object, var_index: Object, var_id: Object) =
        s"""
        | {
        | "key":$var_key,"name":$var_name,"ratio":$var_ratio,"index":$var_index,"id":$var_id
        | }
        """.stripMargin
}
