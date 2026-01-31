namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecShoppingRetargeting

module TargetingSpecOperationShoppingRetargeting =

  //#region TargetingSpecOperationShoppingRetargeting

  [<CLIMutable>]
  type TargetingSpecOperationShoppingRetargeting = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : TargetingSpecShoppingRetargeting[];
  }

  //#endregion
