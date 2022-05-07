namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupPricingCriteria

module MaxPriceFilter =

  //#region MaxPriceFilter

  [<CLIMutable>]
  type MaxPriceFilter = {
    [<JsonProperty(PropertyName = "MAX_PRICE")>]
    MAX_PRICE : CatalogsProductGroupPricingCriteria;
  }

  //#endregion
