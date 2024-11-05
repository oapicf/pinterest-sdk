namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OperationType

module SharedAudienceCommon =

  //#region SharedAudienceCommon


  type SharedAudienceCommon = {
    AudienceId : string;
    OperationType : OperationType;
  }
  //#endregion
