namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceType

module AudienceCreateRequest =

  //#region AudienceCreateRequest


  type AudienceCreateRequest = {
    AdAccountId : string;
    Name : string;
    Rule : AudienceRule;
    Description : string;
    AudienceType : AudienceType;
  }
  //#endregion
