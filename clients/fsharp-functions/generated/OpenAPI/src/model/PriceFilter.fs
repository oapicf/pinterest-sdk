namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupPricingCurrencyCriteria

module PriceFilter =

  //#region PriceFilter

  [<CLIMutable>]
  type PriceFilter = {
    [<JsonProperty(PropertyName = "PRICE")>]
    PRICE : CatalogsProductGroupPricingCurrencyCriteria;
  }

  //#endregion
