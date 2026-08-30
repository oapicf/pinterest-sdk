namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChangeHistoryOperationType
open OpenAPI.Model.EntityDataChangeHistory

module EntityHistory =

  //#region EntityHistory


  type EntityHistory = {
    ChangeTimestamp : int;
    DataChanges : EntityDataChangeHistory[];
    EntityId : string;
    EntityName : string;
    Ldap : string;
    Operation : ChangeHistoryOperationType;
    UserId : string;
  }
  //#endregion
