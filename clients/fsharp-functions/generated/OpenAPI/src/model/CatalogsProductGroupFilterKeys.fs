namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsBaseFilterKeys
open OpenAPI.Model.CatalogsProductGroupCurrencyCriteria
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleGenderCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleMediaTypesCriteria
open OpenAPI.Model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria
open OpenAPI.Model.CatalogsProductGroupPricingCriteria
open OpenAPI.Model.CatalogsProductGroupUint32Criteria
open OpenAPI.Model.ProductGroupReferenceFilter

module CatalogsProductGroupFilterKeys =

  //#region CatalogsProductGroupFilterKeys

  [<CLIMutable>]
  type CatalogsProductGroupFilterKeys = {
    [<JsonProperty(PropertyName = "MIN_PRICE")>]
    MIN_PRICE : CatalogsProductGroupPricingCriteria;
    [<JsonProperty(PropertyName = "MAX_PRICE")>]
    MAX_PRICE : CatalogsProductGroupPricingCriteria;
    [<JsonProperty(PropertyName = "CURRENCY")>]
    CURRENCY : CatalogsProductGroupCurrencyCriteria;
    [<JsonProperty(PropertyName = "ITEM_ID")>]
    ITEM_ID : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "AVAILABILITY")>]
    AVAILABILITY : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "BRAND")>]
    BRAND : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CONDITION")>]
    CONDITION : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_0")>]
    CUSTOMLABEL0 : CatalogsProductGroupFilterOperatorTypeCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_1")>]
    CUSTOMLABEL1 : CatalogsProductGroupFilterOperatorTypeCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_2")>]
    CUSTOMLABEL2 : CatalogsProductGroupFilterOperatorTypeCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_3")>]
    CUSTOMLABEL3 : CatalogsProductGroupFilterOperatorTypeCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_4")>]
    CUSTOMLABEL4 : CatalogsProductGroupFilterOperatorTypeCriteria;
    [<JsonProperty(PropertyName = "ITEM_GROUP_ID")>]
    ITEM_GROUP_ID : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : CatalogsProductGroupMultipleGenderCriteria;
    [<JsonProperty(PropertyName = "MEDIA_TYPE")>]
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_4")>]
    PRODUCTTYPE4 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_3")>]
    PRODUCTTYPE3 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_2")>]
    PRODUCTTYPE2 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_1")>]
    PRODUCTTYPE1 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_TYPE_0")>]
    PRODUCTTYPE0 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_6")>]
    GOOGLEPRODUCTCATEGORY6 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_5")>]
    GOOGLEPRODUCTCATEGORY5 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_4")>]
    GOOGLEPRODUCTCATEGORY4 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_3")>]
    GOOGLEPRODUCTCATEGORY3 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_2")>]
    GOOGLEPRODUCTCATEGORY2 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_1")>]
    GOOGLEPRODUCTCATEGORY1 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "GOOGLE_PRODUCT_CATEGORY_0")>]
    GOOGLEPRODUCTCATEGORY0 : CatalogsProductGroupMultipleStringListCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_0")>]
    CUSTOMNUMBER0 : CatalogsProductGroupUint32Criteria;
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_1")>]
    CUSTOMNUMBER1 : CatalogsProductGroupUint32Criteria;
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_2")>]
    CUSTOMNUMBER2 : CatalogsProductGroupUint32Criteria;
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_3")>]
    CUSTOMNUMBER3 : CatalogsProductGroupUint32Criteria;
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_4")>]
    CUSTOMNUMBER4 : CatalogsProductGroupUint32Criteria;
    [<JsonProperty(PropertyName = "TITLE_KEYWORDS")>]
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "PINTEREST_PRODUCT_CATEGORIES")>]
    PINTEREST_PRODUCT_CATEGORIES : CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
    [<JsonProperty(PropertyName = "PRODUCT_GROUP")>]
    PRODUCT_GROUP : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
