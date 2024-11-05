namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module SharedAudience =

  //#region SharedAudience


  type SharedAudience = {
    AudienceId : string;
    OperationType : OperationType;
    RecipientAccountIds : string[];
  }
  //#endregion
