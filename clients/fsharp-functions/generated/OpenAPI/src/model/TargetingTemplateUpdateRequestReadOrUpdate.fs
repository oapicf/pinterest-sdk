namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceUpdateOperationType
open OpenAPI.Model.TargetingSpecOptimal

module TargetingTemplateUpdateRequestReadOrUpdate =

  //#region TargetingTemplateUpdateRequestReadOrUpdate

  [<CLIMutable>]
  type TargetingTemplateUpdateRequestReadOrUpdate = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : AudienceUpdateOperationType;
    [<JsonProperty(PropertyName = "targeting_attributes")>]
    TargetingAttributes : TargetingSpecOptimal;
  }

  //#endregion
