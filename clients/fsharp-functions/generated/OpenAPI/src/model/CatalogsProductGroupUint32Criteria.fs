namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NumericFilterOperatorType

module CatalogsProductGroupUint32Criteria =

  //#region CatalogsProductGroupUint32Criteria

  [<CLIMutable>]
  type CatalogsProductGroupUint32Criteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "operator")>]
    Operator : NumericFilterOperatorType;
    [<JsonProperty(PropertyName = "value")>]
    Value : int;
  }

  //#endregion
