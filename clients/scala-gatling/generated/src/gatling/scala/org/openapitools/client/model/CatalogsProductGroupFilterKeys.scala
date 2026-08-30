
package org.openapitools.client.model


case class CatalogsProductGroupFilterKeys (
    _MIN_PRICE: CatalogsProductGroupPricingCriteria,
    _MAX_PRICE: CatalogsProductGroupPricingCriteria,
    _CURRENCY: CatalogsProductGroupCurrencyCriteria,
    _ITEM_ID: CatalogsProductGroupMultipleStringCriteria,
    _AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
    _BRAND: CatalogsProductGroupMultipleStringCriteria,
    _CONDITION: CatalogsProductGroupMultipleStringCriteria,
    _CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
    _CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
    _CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
    _CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
    _CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
    _ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,
    _GENDER: CatalogsProductGroupMultipleGenderCriteria,
    _MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
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
    _GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
    _CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,
    _CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,
    _CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,
    _CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,
    _CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,
    _TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,
    _PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria,
    _PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)
object CatalogsProductGroupFilterKeys {
    def toStringBody(var_MIN_PRICE: Object, var_MAX_PRICE: Object, var_CURRENCY: Object, var_ITEM_ID: Object, var_AVAILABILITY: Object, var_BRAND: Object, var_CONDITION: Object, var_CUSTOM_LABEL_0: Object, var_CUSTOM_LABEL_1: Object, var_CUSTOM_LABEL_2: Object, var_CUSTOM_LABEL_3: Object, var_CUSTOM_LABEL_4: Object, var_ITEM_GROUP_ID: Object, var_GENDER: Object, var_MEDIA_TYPE: Object, var_PRODUCT_TYPE_4: Object, var_PRODUCT_TYPE_3: Object, var_PRODUCT_TYPE_2: Object, var_PRODUCT_TYPE_1: Object, var_PRODUCT_TYPE_0: Object, var_GOOGLE_PRODUCT_CATEGORY_6: Object, var_GOOGLE_PRODUCT_CATEGORY_5: Object, var_GOOGLE_PRODUCT_CATEGORY_4: Object, var_GOOGLE_PRODUCT_CATEGORY_3: Object, var_GOOGLE_PRODUCT_CATEGORY_2: Object, var_GOOGLE_PRODUCT_CATEGORY_1: Object, var_GOOGLE_PRODUCT_CATEGORY_0: Object, var_CUSTOM_NUMBER_0: Object, var_CUSTOM_NUMBER_1: Object, var_CUSTOM_NUMBER_2: Object, var_CUSTOM_NUMBER_3: Object, var_CUSTOM_NUMBER_4: Object, var_TITLE_KEYWORDS: Object, var_PINTEREST_PRODUCT_CATEGORIES: Object, var_PRODUCT_GROUP: Object) =
        s"""
        | {
        | "MIN_PRICE":$var_MIN_PRICE,"MAX_PRICE":$var_MAX_PRICE,"CURRENCY":$var_CURRENCY,"ITEM_ID":$var_ITEM_ID,"AVAILABILITY":$var_AVAILABILITY,"BRAND":$var_BRAND,"CONDITION":$var_CONDITION,"CUSTOM_LABEL_0":$var_CUSTOM_LABEL_0,"CUSTOM_LABEL_1":$var_CUSTOM_LABEL_1,"CUSTOM_LABEL_2":$var_CUSTOM_LABEL_2,"CUSTOM_LABEL_3":$var_CUSTOM_LABEL_3,"CUSTOM_LABEL_4":$var_CUSTOM_LABEL_4,"ITEM_GROUP_ID":$var_ITEM_GROUP_ID,"GENDER":$var_GENDER,"MEDIA_TYPE":$var_MEDIA_TYPE,"PRODUCT_TYPE_4":$var_PRODUCT_TYPE_4,"PRODUCT_TYPE_3":$var_PRODUCT_TYPE_3,"PRODUCT_TYPE_2":$var_PRODUCT_TYPE_2,"PRODUCT_TYPE_1":$var_PRODUCT_TYPE_1,"PRODUCT_TYPE_0":$var_PRODUCT_TYPE_0,"GOOGLE_PRODUCT_CATEGORY_6":$var_GOOGLE_PRODUCT_CATEGORY_6,"GOOGLE_PRODUCT_CATEGORY_5":$var_GOOGLE_PRODUCT_CATEGORY_5,"GOOGLE_PRODUCT_CATEGORY_4":$var_GOOGLE_PRODUCT_CATEGORY_4,"GOOGLE_PRODUCT_CATEGORY_3":$var_GOOGLE_PRODUCT_CATEGORY_3,"GOOGLE_PRODUCT_CATEGORY_2":$var_GOOGLE_PRODUCT_CATEGORY_2,"GOOGLE_PRODUCT_CATEGORY_1":$var_GOOGLE_PRODUCT_CATEGORY_1,"GOOGLE_PRODUCT_CATEGORY_0":$var_GOOGLE_PRODUCT_CATEGORY_0,"CUSTOM_NUMBER_0":$var_CUSTOM_NUMBER_0,"CUSTOM_NUMBER_1":$var_CUSTOM_NUMBER_1,"CUSTOM_NUMBER_2":$var_CUSTOM_NUMBER_2,"CUSTOM_NUMBER_3":$var_CUSTOM_NUMBER_3,"CUSTOM_NUMBER_4":$var_CUSTOM_NUMBER_4,"TITLE_KEYWORDS":$var_TITLE_KEYWORDS,"PINTEREST_PRODUCT_CATEGORIES":$var_PINTEREST_PRODUCT_CATEGORIES,"PRODUCT_GROUP":$var_PRODUCT_GROUP
        | }
        """.stripMargin
}
