namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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
open OpenAPI.Model.LinkFilter
open OpenAPI.Model.MediaTypeFilter
open OpenAPI.Model.TitleKeywordsFilter

module CatalogsCreativeAssetsProductGroupFilterKeys =

  //#region CatalogsCreativeAssetsProductGroupFilterKeys

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupFilterKeys = {
    [<JsonProperty(PropertyName = "CREATIVE_ASSETS_ID")>]
    CREATIVE_ASSETS_ID : CatalogsProductGroupMultipleStringCriteria;
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
    [<JsonProperty(PropertyName = "MEDIA_TYPE")>]
    MEDIA_TYPE : CatalogsProductGroupMultipleMediaTypesCriteria;
    [<JsonProperty(PropertyName = "TITLE_KEYWORDS")>]
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "LINK")>]
    LINK : CatalogsProductGroupFilterOperatorTypeCriteria;
  }

  //#endregion
