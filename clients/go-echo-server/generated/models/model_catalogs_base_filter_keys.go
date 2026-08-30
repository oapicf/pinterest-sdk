package models

// CatalogsBaseFilterKeys - Base filter keys shared across catalog filtering
type CatalogsBaseFilterKeys struct {

	MIN_PRICE CatalogsProductGroupPricingCriteria `json:"MIN_PRICE"`

	MAX_PRICE CatalogsProductGroupPricingCriteria `json:"MAX_PRICE"`

	CURRENCY CatalogsProductGroupCurrencyCriteria `json:"CURRENCY"`

	ITEM_ID CatalogsProductGroupMultipleStringCriteria `json:"ITEM_ID"`

	AVAILABILITY CatalogsProductGroupMultipleStringCriteria `json:"AVAILABILITY"`

	BRAND CatalogsProductGroupMultipleStringCriteria `json:"BRAND"`

	CONDITION CatalogsProductGroupMultipleStringCriteria `json:"CONDITION"`

	CUSTOMLABEL0 CatalogsProductGroupFilterOperatorTypeCriteria `json:"CUSTOM_LABEL_0"`

	CUSTOMLABEL1 CatalogsProductGroupFilterOperatorTypeCriteria `json:"CUSTOM_LABEL_1"`

	CUSTOMLABEL2 CatalogsProductGroupFilterOperatorTypeCriteria `json:"CUSTOM_LABEL_2"`

	CUSTOMLABEL3 CatalogsProductGroupFilterOperatorTypeCriteria `json:"CUSTOM_LABEL_3"`

	CUSTOMLABEL4 CatalogsProductGroupFilterOperatorTypeCriteria `json:"CUSTOM_LABEL_4"`

	ITEM_GROUP_ID CatalogsProductGroupMultipleStringCriteria `json:"ITEM_GROUP_ID"`

	GENDER CatalogsProductGroupMultipleGenderCriteria `json:"GENDER"`

	MEDIA_TYPE CatalogsProductGroupMultipleMediaTypesCriteria `json:"MEDIA_TYPE"`

	PRODUCTTYPE4 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_4"`

	PRODUCTTYPE3 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_3"`

	PRODUCTTYPE2 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_2"`

	PRODUCTTYPE1 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_1"`

	PRODUCTTYPE0 CatalogsProductGroupMultipleStringListCriteria `json:"PRODUCT_TYPE_0"`

	GOOGLEPRODUCTCATEGORY6 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_6"`

	GOOGLEPRODUCTCATEGORY5 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_5"`

	GOOGLEPRODUCTCATEGORY4 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_4"`

	GOOGLEPRODUCTCATEGORY3 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_3"`

	GOOGLEPRODUCTCATEGORY2 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_2"`

	GOOGLEPRODUCTCATEGORY1 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_1"`

	GOOGLEPRODUCTCATEGORY0 CatalogsProductGroupMultipleStringListCriteria `json:"GOOGLE_PRODUCT_CATEGORY_0"`

	CUSTOMNUMBER0 CatalogsProductGroupUint32Criteria `json:"CUSTOM_NUMBER_0"`

	CUSTOMNUMBER1 CatalogsProductGroupUint32Criteria `json:"CUSTOM_NUMBER_1"`

	CUSTOMNUMBER2 CatalogsProductGroupUint32Criteria `json:"CUSTOM_NUMBER_2"`

	CUSTOMNUMBER3 CatalogsProductGroupUint32Criteria `json:"CUSTOM_NUMBER_3"`

	CUSTOMNUMBER4 CatalogsProductGroupUint32Criteria `json:"CUSTOM_NUMBER_4"`

	TITLE_KEYWORDS CatalogsProductGroupMultipleStringCriteria `json:"TITLE_KEYWORDS"`

	PINTEREST_PRODUCT_CATEGORIES CatalogsProductGroupMultiplePinterestProductCategoryCriteria `json:"PINTEREST_PRODUCT_CATEGORIES"`
}
