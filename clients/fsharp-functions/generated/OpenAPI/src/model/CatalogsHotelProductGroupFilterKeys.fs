namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BrandFilter
open OpenAPI.Model.CatalogsProductGroupMultipleCountriesCriteria
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria
open OpenAPI.Model.CatalogsProductGroupPricingCurrencyCriteria
open OpenAPI.Model.CountryFilter
open OpenAPI.Model.CustomLabel0Filter
open OpenAPI.Model.CustomLabel1Filter
open OpenAPI.Model.CustomLabel2Filter
open OpenAPI.Model.CustomLabel3Filter
open OpenAPI.Model.CustomLabel4Filter
open OpenAPI.Model.HotelIdFilter
open OpenAPI.Model.PriceFilter

module CatalogsHotelProductGroupFilterKeys =

  //#region CatalogsHotelProductGroupFilterKeys

  [<CLIMutable>]
  type CatalogsHotelProductGroupFilterKeys = {
    [<JsonProperty(PropertyName = "PRICE")>]
    PRICE : CatalogsProductGroupPricingCurrencyCriteria;
    [<JsonProperty(PropertyName = "HOTEL_ID")>]
    HOTEL_ID : CatalogsProductGroupMultipleStringCriteria;
    [<JsonProperty(PropertyName = "BRAND")>]
    BRAND : CatalogsProductGroupMultipleStringCriteria;
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
    [<JsonProperty(PropertyName = "COUNTRY")>]
    COUNTRY : CatalogsProductGroupMultipleCountriesCriteria;
  }

  //#endregion
