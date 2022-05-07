namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupCurrencyCriteria

module CurrencyFilter =

  //#region CurrencyFilter

  [<CLIMutable>]
  type CurrencyFilter = {
    [<JsonProperty(PropertyName = "CURRENCY")>]
    CURRENCY : CatalogsProductGroupCurrencyCriteria;
  }

  //#endregion
