namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NonNullableCatalogsCurrency

module CatalogsProductGroupCurrencyCriteria =

  //#region CatalogsProductGroupCurrencyCriteria

  [<CLIMutable>]
  type CatalogsProductGroupCurrencyCriteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : NonNullableCatalogsCurrency;
  }

  //#endregion
