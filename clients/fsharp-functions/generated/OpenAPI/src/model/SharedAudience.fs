namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OperationType

module SharedAudience =

  //#region SharedAudience

  [<CLIMutable>]
  type SharedAudience = {
    [<JsonProperty(PropertyName = "audience_id")>]
    AudienceId : string;
    [<JsonProperty(PropertyName = "operation_type")>]
    OperationType : OperationType;
    [<JsonProperty(PropertyName = "recipient_account_ids")>]
    RecipientAccountIds : string[];
  }

  //#endregion
