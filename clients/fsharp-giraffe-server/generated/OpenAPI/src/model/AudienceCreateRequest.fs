namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceCreateRequest1AudienceType
open OpenAPI.Model.AudienceRule

module AudienceCreateRequest =

  //#region AudienceCreateRequest


  type AudienceCreateRequest = {
    AdAccountId : string;
    Name : string;
    Rule : AudienceRule;
    Description : string;
    AudienceType : AudienceCreateRequest1AudienceType;
  }
  //#endregion
