namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PriceFilterPrice

module PriceFilter =

  //#region PriceFilter

  [<CLIMutable>]
  type PriceFilter = {
    [<JsonProperty(PropertyName = "PRICE")>]
    PRICE : PriceFilterPrice;
  }

  //#endregion
