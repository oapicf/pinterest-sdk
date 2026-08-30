namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NonNullableCatalogsCurrency
open OpenAPI.Model.NumericFilterOperatorType

module PriceFilterPrice =

  //#region PriceFilterPrice

  [<CLIMutable>]
  type PriceFilterPrice = {
    [<JsonProperty(PropertyName = "currency")>]
    Currency : NonNullableCatalogsCurrency;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "operator")>]
    Operator : NumericFilterOperatorType;
    [<JsonProperty(PropertyName = "value")>]
    Value : decimal;
  }

  //#endregion
