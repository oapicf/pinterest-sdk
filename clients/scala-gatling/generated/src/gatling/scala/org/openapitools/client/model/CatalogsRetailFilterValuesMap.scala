
package org.openapitools.client.model


case class CatalogsRetailFilterValuesMap (
    _adImageTags: Option[List[String]],
    _adVideoTags: Option[List[String]],
    _availability: Option[List[String]],
    _brand: Option[List[String]],
    _condition: Option[List[String]],
    _customLabel0: Option[List[String]],
    _customLabel1: Option[List[String]],
    _customLabel2: Option[List[String]],
    _customLabel3: Option[List[String]],
    _customLabel4: Option[List[String]],
    _gender: Option[List[String]],
    _googleProductCategory0: Option[List[String]],
    _googleProductCategory1: Option[List[String]],
    _googleProductCategory2: Option[List[String]],
    _googleProductCategory3: Option[List[String]],
    _googleProductCategory4: Option[List[String]],
    _googleProductCategory5: Option[List[String]],
    _googleProductCategory6: Option[List[String]],
    _mediaType: Option[List[String]],
    _productType0: Option[List[String]],
    _productType1: Option[List[String]],
    _productType2: Option[List[String]],
    _productType3: Option[List[String]],
    _productType4: Option[List[String]]
)
object CatalogsRetailFilterValuesMap {
    def toStringBody(var_adImageTags: Object, var_adVideoTags: Object, var_availability: Object, var_brand: Object, var_condition: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_gender: Object, var_googleProductCategory0: Object, var_googleProductCategory1: Object, var_googleProductCategory2: Object, var_googleProductCategory3: Object, var_googleProductCategory4: Object, var_googleProductCategory5: Object, var_googleProductCategory6: Object, var_mediaType: Object, var_productType0: Object, var_productType1: Object, var_productType2: Object, var_productType3: Object, var_productType4: Object) =
        s"""
        | {
        | "adImageTags":$var_adImageTags,"adVideoTags":$var_adVideoTags,"availability":$var_availability,"brand":$var_brand,"condition":$var_condition,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"gender":$var_gender,"googleProductCategory0":$var_googleProductCategory0,"googleProductCategory1":$var_googleProductCategory1,"googleProductCategory2":$var_googleProductCategory2,"googleProductCategory3":$var_googleProductCategory3,"googleProductCategory4":$var_googleProductCategory4,"googleProductCategory5":$var_googleProductCategory5,"googleProductCategory6":$var_googleProductCategory6,"mediaType":$var_mediaType,"productType0":$var_productType0,"productType1":$var_productType1,"productType2":$var_productType2,"productType3":$var_productType3,"productType4":$var_productType4
        | }
        """.stripMargin
}
