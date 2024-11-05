namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OperationType

module SharedAudienceCommon =

  //#region SharedAudienceCommon

  [<CLIMutable>]
  type SharedAudienceCommon = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : OperationType;
  }

  //#endregion
