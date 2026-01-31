namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupFilterOperatorTypeCriteria =

  //#region CatalogsProductGroupFilterOperatorTypeCriteria

  [<CLIMutable>]
  type CatalogsProductGroupFilterOperatorTypeCriteria = {
    [<JsonProperty(PropertyName = "filter_operator_type")>]
    FilterOperatorType : string;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
  }

  //#endregion
