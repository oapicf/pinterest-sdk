
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupFilterKeys (
    _CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
    _GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
    _MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria
)
object CatalogsCreativeAssetsProductGroupFilterKeys {
    def toStringBody(var_CREATIVE_ASSETS_ID: Object, var_CUSTOM_LABEL_0: Object, var_CUSTOM_LABEL_1: Object, var_CUSTOM_LABEL_2: Object, var_CUSTOM_LABEL_3: Object, var_CUSTOM_LABEL_4: Object, var_GOOGLE_PRODUCT_CATEGORY_6: Object, var_GOOGLE_PRODUCT_CATEGORY_5: Object, var_GOOGLE_PRODUCT_CATEGORY_4: Object, var_GOOGLE_PRODUCT_CATEGORY_3: Object, var_GOOGLE_PRODUCT_CATEGORY_2: Object, var_GOOGLE_PRODUCT_CATEGORY_1: Object, var_GOOGLE_PRODUCT_CATEGORY_0: Object, var_MEDIA_TYPE: Object) =
        s"""
        | {
        | "CREATIVE_ASSETS_ID":$var_CREATIVE_ASSETS_ID,"CUSTOM_LABEL_0":$var_CUSTOM_LABEL_0,"CUSTOM_LABEL_1":$var_CUSTOM_LABEL_1,"CUSTOM_LABEL_2":$var_CUSTOM_LABEL_2,"CUSTOM_LABEL_3":$var_CUSTOM_LABEL_3,"CUSTOM_LABEL_4":$var_CUSTOM_LABEL_4,"GOOGLE_PRODUCT_CATEGORY_6":$var_GOOGLE_PRODUCT_CATEGORY_6,"GOOGLE_PRODUCT_CATEGORY_5":$var_GOOGLE_PRODUCT_CATEGORY_5,"GOOGLE_PRODUCT_CATEGORY_4":$var_GOOGLE_PRODUCT_CATEGORY_4,"GOOGLE_PRODUCT_CATEGORY_3":$var_GOOGLE_PRODUCT_CATEGORY_3,"GOOGLE_PRODUCT_CATEGORY_2":$var_GOOGLE_PRODUCT_CATEGORY_2,"GOOGLE_PRODUCT_CATEGORY_1":$var_GOOGLE_PRODUCT_CATEGORY_1,"GOOGLE_PRODUCT_CATEGORY_0":$var_GOOGLE_PRODUCT_CATEGORY_0,"MEDIA_TYPE":$var_MEDIA_TYPE
        | }
        """.stripMargin
}
