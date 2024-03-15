
package org.openapitools.client.model


case class CatalogsProductGroupFilterKeys (
    _MIN_PRICE: CatalogsProductGroupPricingCriteria,
    _MAX_PRICE: CatalogsProductGroupPricingCriteria,
    _CURRENCY: CatalogsProductGroupCurrencyCriteria,
    _ITEM_ID: CatalogsProductGroupMultipleStringCriteria,
    _AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
    _BRAND: CatalogsProductGroupMultipleStringCriteria,
    _CONDITION: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
    _ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,
    _GENDER: CatalogsProductGroupMultipleGenderCriteria,
    _PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,
    _PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,
    _PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,
    _PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,
    _PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
    _GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria
)
object CatalogsProductGroupFilterKeys {
    def toStringBody(var_MIN_PRICE: Object, var_MAX_PRICE: Object, var_CURRENCY: Object, var_ITEM_ID: Object, var_AVAILABILITY: Object, var_BRAND: Object, var_CONDITION: Object, var_CUSTOM_LABEL_0: Object, var_CUSTOM_LABEL_1: Object, var_CUSTOM_LABEL_2: Object, var_CUSTOM_LABEL_3: Object, var_CUSTOM_LABEL_4: Object, var_ITEM_GROUP_ID: Object, var_GENDER: Object, var_PRODUCT_TYPE_4: Object, var_PRODUCT_TYPE_3: Object, var_PRODUCT_TYPE_2: Object, var_PRODUCT_TYPE_1: Object, var_PRODUCT_TYPE_0: Object, var_GOOGLE_PRODUCT_CATEGORY_6: Object, var_GOOGLE_PRODUCT_CATEGORY_5: Object, var_GOOGLE_PRODUCT_CATEGORY_4: Object, var_GOOGLE_PRODUCT_CATEGORY_3: Object, var_GOOGLE_PRODUCT_CATEGORY_2: Object, var_GOOGLE_PRODUCT_CATEGORY_1: Object, var_GOOGLE_PRODUCT_CATEGORY_0: Object) =
        s"""
        | {
        | "MIN_PRICE":$var_MIN_PRICE,"MAX_PRICE":$var_MAX_PRICE,"CURRENCY":$var_CURRENCY,"ITEM_ID":$var_ITEM_ID,"AVAILABILITY":$var_AVAILABILITY,"BRAND":$var_BRAND,"CONDITION":$var_CONDITION,"CUSTOM_LABEL_0":$var_CUSTOM_LABEL_0,"CUSTOM_LABEL_1":$var_CUSTOM_LABEL_1,"CUSTOM_LABEL_2":$var_CUSTOM_LABEL_2,"CUSTOM_LABEL_3":$var_CUSTOM_LABEL_3,"CUSTOM_LABEL_4":$var_CUSTOM_LABEL_4,"ITEM_GROUP_ID":$var_ITEM_GROUP_ID,"GENDER":$var_GENDER,"PRODUCT_TYPE_4":$var_PRODUCT_TYPE_4,"PRODUCT_TYPE_3":$var_PRODUCT_TYPE_3,"PRODUCT_TYPE_2":$var_PRODUCT_TYPE_2,"PRODUCT_TYPE_1":$var_PRODUCT_TYPE_1,"PRODUCT_TYPE_0":$var_PRODUCT_TYPE_0,"GOOGLE_PRODUCT_CATEGORY_6":$var_GOOGLE_PRODUCT_CATEGORY_6,"GOOGLE_PRODUCT_CATEGORY_5":$var_GOOGLE_PRODUCT_CATEGORY_5,"GOOGLE_PRODUCT_CATEGORY_4":$var_GOOGLE_PRODUCT_CATEGORY_4,"GOOGLE_PRODUCT_CATEGORY_3":$var_GOOGLE_PRODUCT_CATEGORY_3,"GOOGLE_PRODUCT_CATEGORY_2":$var_GOOGLE_PRODUCT_CATEGORY_2,"GOOGLE_PRODUCT_CATEGORY_1":$var_GOOGLE_PRODUCT_CATEGORY_1,"GOOGLE_PRODUCT_CATEGORY_0":$var_GOOGLE_PRODUCT_CATEGORY_0
        | }
        """.stripMargin
}
