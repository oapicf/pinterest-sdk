namespace OpenAPI.Model

open System
open System.Collections.Generic
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

module CatalogsCreativeAssetsProductGroupFilterKeys =

  //#region CatalogsCreativeAssetsProductGroupFilterKeys


  type CatalogsCreativeAssetsProductGroupFilterKeys = {
    CREATIVE_ASSETS_ID : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL0 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL1 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL2 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL3 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL4 : CatalogsProductGroupMultipleStringCriteria;
    GOOGLEPRODUCTCATEGORY6 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY5 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY4 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY3 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY2 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY1 : CatalogsProductGroupMultipleStringListCriteria;
    GOOGLEPRODUCTCATEGORY0 : CatalogsProductGroupMultipleStringListCriteria;
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
  }
  //#endregion
