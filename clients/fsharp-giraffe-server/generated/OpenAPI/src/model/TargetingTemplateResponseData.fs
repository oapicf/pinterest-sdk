namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingTemplateAudienceSizing
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls

module TargetingTemplateResponseData =

  //#region TargetingTemplateResponseData

  //#region enums
  type StatusEnum = ACTIVEEnum of string  |  DELETEDEnum of string  
  //#endregion

  type TargetingTemplateResponseData = {
    Name : string;
    AutoTargetingEnabled : bool;
    TargetingAttributes : TargetingSpec;
    PlacementGroup : PlacementGroupType;
    Keywords : TargetingTemplateKeyword[];
    TrackingUrls : TrackingUrls;
    Id : string;
    CreatedTime : int;
    UpdatedTime : int;
    AdAccountId : string;
    Status : StatusEnum;
    Sizing : TargetingTemplateAudienceSizing;
  }
  //#endregion
