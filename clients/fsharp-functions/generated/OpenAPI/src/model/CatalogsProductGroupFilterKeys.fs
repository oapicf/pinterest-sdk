namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AvailabilityFilter
open OpenAPI.Model.BrandFilter
open OpenAPI.Model.CatalogsProductGroupCurrencyCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleGenderCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria
open OpenAPI.Model.CatalogsProductGroupPricingCriteria
open OpenAPI.Model.ConditionFilter
open OpenAPI.Model.CurrencyFilter
open OpenAPI.Model.CustomLabel0Filter
open OpenAPI.Model.CustomLabel1Filter
open OpenAPI.Model.CustomLabel2Filter
open OpenAPI.Model.CustomLabel3Filter
open OpenAPI.Model.CustomLabel4Filter
open OpenAPI.Model.GenderFilter
open OpenAPI.Model.GoogleProductCategory0Filter
open OpenAPI.Model.GoogleProductCategory1Filter
open OpenAPI.Model.GoogleProductCategory2Filter
open OpenAPI.Model.GoogleProductCategory3Filter
open OpenAPI.Model.GoogleProductCategory4Filter
open OpenAPI.Model.GoogleProductCategory5Filter
open OpenAPI.Model.GoogleProductCategory6Filter
open OpenAPI.Model.ItemGroupIdFilter
open OpenAPI.Model.ItemIdFilter
open OpenAPI.Model.MaxPriceFilter
open OpenAPI.Model.MinPriceFilter
open OpenAPI.Model.ProductType0Filter
open OpenAPI.Model.ProductType1Filter
open OpenAPI.Model.ProductType2Filter
open OpenAPI.Model.ProductType3Filter
open OpenAPI.Model.ProductType4Filter

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
    CUSTOMLABEL0 : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_1")>]
    CUSTOMLABEL1 : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_2")>]
    CUSTOMLABEL2 : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_3")>]
    CUSTOMLABEL3 : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_4")>]
    CUSTOMLABEL4 : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "ITEM_GROUP_ID")>]
    ITEM_GROUP_ID : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : CatalogsProductGroupMultipleGenderCriteria;
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
  }

  //#endregion
