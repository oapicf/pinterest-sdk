
package org.openapitools.client.model


case class CatalogsHotelFilterValuesMap (
    _brand: Option[List[String]],
    _customLabel0: Option[List[String]],
    _customLabel1: Option[List[String]],
    _customLabel2: Option[List[String]],
    _customLabel3: Option[List[String]],
    _customLabel4: Option[List[String]]
)
object CatalogsHotelFilterValuesMap {
    def toStringBody(var_brand: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object) =
        s"""
        | {
        | "brand":$var_brand,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4
        | }
        """.stripMargin
}
