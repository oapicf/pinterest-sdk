
package org.openapitools.client.model


case class CatalogsCreativeAssetsFilterValuesMap (
    _customLabel0: Option[List[String]],
    _customLabel1: Option[List[String]],
    _customLabel2: Option[List[String]],
    _customLabel3: Option[List[String]],
    _customLabel4: Option[List[String]],
    _googleProductCategory0: Option[List[String]],
    _googleProductCategory1: Option[List[String]],
    _googleProductCategory2: Option[List[String]],
    _googleProductCategory3: Option[List[String]],
    _googleProductCategory4: Option[List[String]],
    _googleProductCategory5: Option[List[String]],
    _googleProductCategory6: Option[List[String]],
    _mediaType: Option[List[String]]
)
object CatalogsCreativeAssetsFilterValuesMap {
    def toStringBody(var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_googleProductCategory0: Object, var_googleProductCategory1: Object, var_googleProductCategory2: Object, var_googleProductCategory3: Object, var_googleProductCategory4: Object, var_googleProductCategory5: Object, var_googleProductCategory6: Object, var_mediaType: Object) =
        s"""
        | {
        | "customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"googleProductCategory0":$var_googleProductCategory0,"googleProductCategory1":$var_googleProductCategory1,"googleProductCategory2":$var_googleProductCategory2,"googleProductCategory3":$var_googleProductCategory3,"googleProductCategory4":$var_googleProductCategory4,"googleProductCategory5":$var_googleProductCategory5,"googleProductCategory6":$var_googleProductCategory6,"mediaType":$var_mediaType
        | }
        """.stripMargin
}
