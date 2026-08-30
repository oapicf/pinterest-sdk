namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingTemplateStatus

module CustomerSegment =

  //#region CustomerSegment


  type CustomerSegment = {
    AdAccountId : string;
    AudienceIds : string[];
    CreatedTime : int;
    Id : string;
    Name : string;
    Status : TargetingTemplateStatus;
    UpdatedTime : int;
  }
  //#endregion
