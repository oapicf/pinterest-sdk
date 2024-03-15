namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NonNullableCatalogsCurrency

module CatalogsProductGroupPricingCurrencyCriteria =

  //#region CatalogsProductGroupPricingCurrencyCriteria

  [<CLIMutable>]
  type CatalogsProductGroupPricingCurrencyCriteria = {
    [<JsonProperty(PropertyName = "operator")>]
    Operator : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : NonNullableCatalogsCurrency;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
