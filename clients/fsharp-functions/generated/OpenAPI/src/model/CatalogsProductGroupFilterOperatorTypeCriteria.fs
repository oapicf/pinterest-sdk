namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FilterOperatorType

module CatalogsProductGroupFilterOperatorTypeCriteria =

  //#region CatalogsProductGroupFilterOperatorTypeCriteria

  [<CLIMutable>]
  type CatalogsProductGroupFilterOperatorTypeCriteria = {
    [<JsonProperty(PropertyName = "filter_operator_type")>]
    FilterOperatorType : FilterOperatorType;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
  }

  //#endregion
