namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceUpdateOperationType

module AudienceUpdateRequest =

  //#region AudienceUpdateRequest


  type AudienceUpdateRequest = {
    AdAccountId : string;
    Name : string;
    Rule : AudienceRule;
    Description : string;
    OperationType : AudienceUpdateOperationType;
  }
  //#endregion
