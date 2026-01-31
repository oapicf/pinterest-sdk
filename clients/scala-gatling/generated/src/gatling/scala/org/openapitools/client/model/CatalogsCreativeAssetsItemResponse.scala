
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemResponse (
    _attributes: Option[CatalogsCreativeAssetsAttributes],
    _catalogType: CatalogsType,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* The pins mapped to the item */
    _pins: Option[List[Pin]]
)
object CatalogsCreativeAssetsItemResponse {
    def toStringBody(var_attributes: Object, var_catalogType: Object, var_creativeAssetsId: Object, var_pins: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"catalogType":$var_catalogType,"creativeAssetsId":$var_creativeAssetsId,"pins":$var_pins
        | }
        """.stripMargin
}
