namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NonNullableCatalogsCurrency

module CatalogsProductGroupCurrencyCriteria =

  //#region CatalogsProductGroupCurrencyCriteria

  [<CLIMutable>]
  type CatalogsProductGroupCurrencyCriteria = {
    [<JsonProperty(PropertyName = "values")>]
    Values : NonNullableCatalogsCurrency;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
