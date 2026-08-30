namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CatalogsProductGroupFilterKeys = {
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
    PRODUCT_GROUP : CatalogsProductGroupMultipleStringCriteria;
  }
  //#endregion
