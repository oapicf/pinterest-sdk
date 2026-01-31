namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpec

module TargetingTemplateUpdateRequest =

  //#region TargetingTemplateUpdateRequest

  [<CLIMutable>]
  type TargetingTemplateUpdateRequest = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : string;
    [<JsonProperty(PropertyName = "targeting_attributes")>]
    TargetingAttributes : TargetingSpec;
  }

  //#endregion
