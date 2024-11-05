
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemResponse (
    _catalogType: CatalogsType,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]],
    _attributes: Option[CatalogsCreativeAssetsAttributes]
)
object CatalogsCreativeAssetsItemResponse {
    def toStringBody(var_catalogType: Object, var_creativeAssetsId: Object, var_pins: Object, var_attributes: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"creativeAssetsId":$var_creativeAssetsId,"pins":$var_pins,"attributes":$var_attributes
        | }
        """.stripMargin
}
