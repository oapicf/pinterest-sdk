namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupUint32Criteria =

  //#region CatalogsProductGroupUint32Criteria

  [<CLIMutable>]
  type CatalogsProductGroupUint32Criteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "operator")>]
    Operator : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : int;
  }

  //#endregion
