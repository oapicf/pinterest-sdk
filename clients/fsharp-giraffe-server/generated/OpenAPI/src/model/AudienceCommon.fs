namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceRule

module AudienceCommon =

  //#region AudienceCommon


  type AudienceCommon = {
    AdAccountId : string;
    Name : string;
    Rule : AudienceRule;
  }
  //#endregion
