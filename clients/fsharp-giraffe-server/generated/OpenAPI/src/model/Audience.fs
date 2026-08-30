namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceStatus
open OpenAPI.Model.PinnerListType
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module Audience =

  //#region Audience


  type Audience = {
    AdAccountId : string;
    AudienceType : PinnerListType;
    CreatedByCompanyName : string option;
    CreatedTimestamp : int option;
    Description : string option;
    Id : string;
    IsNca : bool;
    Name : string;
    Rule : AudienceRule;
    Size : int option;
    Status : AudienceStatus;
    Type : string;
    UpdatedTimestamp : int option;
  }
  //#endregion
