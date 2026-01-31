namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Audience =

  //#region Audience


  type Audience = {
    AdAccountId : string;
    AudienceType : string;
    CreatedByCompanyName : string option;
    CreatedTimestamp : int option;
    Description : string option;
    Id : string;
    Name : string;
    Rule : AudienceRule;
    Size : int option;
    Status : string;
    Type : string;
    UpdatedTimestamp : int option;
  }
  //#endregion
