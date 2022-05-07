namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupPricingCriteria

module MinPriceFilter =

  //#region MinPriceFilter

  [<CLIMutable>]
  type MinPriceFilter = {
    [<JsonProperty(PropertyName = "MIN_PRICE")>]
    MIN_PRICE : CatalogsProductGroupPricingCriteria;
  }

  //#endregion
