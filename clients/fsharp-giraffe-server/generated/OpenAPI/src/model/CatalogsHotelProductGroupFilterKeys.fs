namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CatalogsHotelProductGroupFilterKeys = {
    PRICE : CatalogsProductGroupPricingCurrencyCriteria;
    HOTEL_ID : CatalogsProductGroupMultipleStringCriteria;
    BRAND : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL0 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL1 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL2 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL3 : CatalogsProductGroupMultipleStringCriteria;
    CUSTOMLABEL4 : CatalogsProductGroupMultipleStringCriteria;
    COUNTRY : CatalogsProductGroupMultipleCountriesCriteria;
  }
  //#endregion
