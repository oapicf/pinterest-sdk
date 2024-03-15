namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CatalogsProductGroupFilterKeys = {
    MIN_PRICE : CatalogsProductGroupPricingCriteria;
    MAX_PRICE : CatalogsProductGroupPricingCriteria;
    CURRENCY : CatalogsProductGroupCurrencyCriteria;
    ITEM_ID : CatalogsProductGroupMultipleStringCriteria;
    AVAILABILITY : CatalogsProductGroupMultipleStringCriteria;
    BRAND : CatalogsProductGroupMultipleStringCriteria;
    CONDITION : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL0 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL1 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL2 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL3 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL4 : CatalogsProductGroupMultipleStringCriteria;
    ITEM_GROUP_ID : CatalogsProductGroupMultipleStringCriteria;
    GENDER : CatalogsProductGroupMultipleGenderCriteria;
    PRODUCTTYPE4 : CatalogsProductGroupMultipleStringListCriteria;
    PRODUCTTYPE3 : CatalogsProductGroupMultipleStringListCriteria;
    PRODUCTTYPE2 : CatalogsProductGroupMultipleStringListCriteria;
    PRODUCTTYPE1 : CatalogsProductGroupMultipleStringListCriteria;
    PRODUCTTYPE0 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY6 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY5 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY4 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY3 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY2 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY1 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY0 : CatalogsProductGroupMultipleStringListCriteria;
  }
  //#endregion
