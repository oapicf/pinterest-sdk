namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChangeHistoryOperationType
open OpenAPI.Model.EntityDataChangeHistory

module EntityHistory =

  //#region EntityHistory

  [<CLIMutable>]
  type EntityHistory = {
    [<JsonProperty(PropertyName = "change_timestamp")>]
    ChangeTimestamp : int;
    [<JsonProperty(PropertyName = "data_changes")>]
    DataChanges : EntityDataChangeHistory[];
    [<JsonProperty(PropertyName = "entity_id")>]
    EntityId : string;
    [<JsonProperty(PropertyName = "entity_name")>]
    EntityName : string;
    [<JsonProperty(PropertyName = "ldap")>]
    Ldap : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : ChangeHistoryOperationType;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : string;
  }

  //#endregion
