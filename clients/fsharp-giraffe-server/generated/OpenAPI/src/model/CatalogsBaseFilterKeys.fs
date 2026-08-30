namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AvailabilityFilter
open OpenAPI.Model.BrandFilter
open OpenAPI.Model.CatalogsProductGroupCurrencyCriteria
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleGenderCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleMediaTypesCriteria
open OpenAPI.Model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria
open OpenAPI.Model.CatalogsProductGroupPricingCriteria
open OpenAPI.Model.CatalogsProductGroupUint32Criteria
open OpenAPI.Model.ConditionFilter
open OpenAPI.Model.CurrencyFilter
open OpenAPI.Model.CustomLabel0Filter
open OpenAPI.Model.CustomLabel1Filter
open OpenAPI.Model.CustomLabel2Filter
open OpenAPI.Model.CustomLabel3Filter
open OpenAPI.Model.CustomLabel4Filter
open OpenAPI.Model.CustomNumber0Filter
open OpenAPI.Model.CustomNumber1Filter
open OpenAPI.Model.CustomNumber2Filter
open OpenAPI.Model.CustomNumber3Filter
open OpenAPI.Model.CustomNumber4Filter
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
open OpenAPI.Model.MediaTypeFilter
open OpenAPI.Model.MinPriceFilter
open OpenAPI.Model.PinterestProductCategoriesFilter
open OpenAPI.Model.ProductType0Filter
open OpenAPI.Model.ProductType1Filter
open OpenAPI.Model.ProductType2Filter
open OpenAPI.Model.ProductType3Filter
open OpenAPI.Model.ProductType4Filter
open OpenAPI.Model.TitleKeywordsFilter

module CatalogsBaseFilterKeys =

  //#region CatalogsBaseFilterKeys


  type CatalogsBaseFilterKeys = {
    MIN_PRICE : CatalogsProductGroupPricingCriteria;
    MAX_PRICE : CatalogsProductGroupPricingCriteria;
    CURRENCY : CatalogsProductGroupCurrencyCriteria;
    ITEM_ID : CatalogsProductGroupMultipleStringCriteria;
    AVAILABILITY : CatalogsProductGroupMultipleStringCriteria;
    BRAND : CatalogsProductGroupMultipleStringCriteria;
    CONDITION : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL0 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL1 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL2 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL3 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL4 : CatalogsProductGroupFilterOperatorTypeCriteria;
    ITEM_GROUP_ID : CatalogsProductGroupMultipleStringCriteria;
    GENDER : CatalogsProductGroupMultipleGenderCriteria;
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
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
    CUSTOMNUMBER0 : CatalogsProductGroupUint32Criteria;
    CUSTOMNUMBER1 : CatalogsProductGroupUint32Criteria;
    CUSTOMNUMBER2 : CatalogsProductGroupUint32Criteria;
    CUSTOMNUMBER3 : CatalogsProductGroupUint32Criteria;
    CUSTOMNUMBER4 : CatalogsProductGroupUint32Criteria;
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
    PINTEREST_PRODUCT_CATEGORIES : CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
  }
  //#endregion
