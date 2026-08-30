namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BrandFilter
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleCountriesCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CountryFilter
open OpenAPI.Model.CustomLabel0Filter
open OpenAPI.Model.CustomLabel1Filter
open OpenAPI.Model.CustomLabel2Filter
open OpenAPI.Model.CustomLabel3Filter
open OpenAPI.Model.CustomLabel4Filter
open OpenAPI.Model.HotelIdFilter
open OpenAPI.Model.PriceFilter
open OpenAPI.Model.PriceFilterPrice
open OpenAPI.Model.TitleKeywordsFilter

module CatalogsHotelProductGroupFilterKeys =

  //#region CatalogsHotelProductGroupFilterKeys

  [<CLIMutable>]
  type CatalogsHotelProductGroupFilterKeys = {
    [<JsonProperty(PropertyName = "PRICE")>]
    PRICE : PriceFilterPrice;
    [<JsonProperty(PropertyName = "HOTEL_ID")>]
    HOTEL_ID : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "BRAND")>]
    BRAND : CatalogsProductGroupMultipleStringCriteria;
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
    [<JsonProperty(PropertyName = "COUNTRY")>]
    COUNTRY : CatalogsProductGroupMultipleCountriesCriteria;
    [<JsonProperty(PropertyName = "TITLE_KEYWORDS")>]
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
