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
    Id : string;
    Name : string;
    AudienceType : string;
    Description : string option;
    Rule : AudienceRule;
    Size : int option;
    Status : string;
    Type : string;
    CreatedTimestamp : int option;
    UpdatedTimestamp : int option;
  }
  //#endregion
