namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleMediaTypesCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringListCriteria
open OpenAPI.Model.CreativeAssetsIdFilter
open OpenAPI.Model.CustomLabel0Filter
open OpenAPI.Model.CustomLabel1Filter
open OpenAPI.Model.CustomLabel2Filter
open OpenAPI.Model.CustomLabel3Filter
open OpenAPI.Model.CustomLabel4Filter
open OpenAPI.Model.GoogleProductCategory0Filter
open OpenAPI.Model.GoogleProductCategory1Filter
open OpenAPI.Model.GoogleProductCategory2Filter
open OpenAPI.Model.GoogleProductCategory3Filter
open OpenAPI.Model.GoogleProductCategory4Filter
open OpenAPI.Model.GoogleProductCategory5Filter
open OpenAPI.Model.GoogleProductCategory6Filter
open OpenAPI.Model.MediaTypeFilter
open OpenAPI.Model.TitleKeywordsFilter

module CatalogsCreativeAssetsProductGroupFilterKeys =

  //#region CatalogsCreativeAssetsProductGroupFilterKeys


  type CatalogsCreativeAssetsProductGroupFilterKeys = {
    CREATIVE_ASSETS_ID : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL0 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL1 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL2 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL3 : CatalogsProductGroupFilterOperatorTypeCriteria;
    CUSTOMLABEL4 : CatalogsProductGroupFilterOperatorTypeCriteria;
    GOOGLEPRODUCTCATEGORY6 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY5 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY4 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY3 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY2 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY1 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY0 : CatalogsProductGroupMultipleStringListCriteria;
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
  }
  //#endregion
