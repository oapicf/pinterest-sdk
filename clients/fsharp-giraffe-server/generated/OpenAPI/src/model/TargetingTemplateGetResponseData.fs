namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingTemplateAudienceSizing
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option

module TargetingTemplateGetResponseData =

  //#region TargetingTemplateGetResponseData

  //#region enums
  type StatusEnum = ACTIVEEnum of string  |  DELETEDEnum of string  
  //#endregion

  type TargetingTemplateGetResponseData = {
    AutoTargetingEnabled : bool;
    Keywords : TargetingTemplateKeyword[];
    Name : string;
    PlacementGroup : PlacementGroupType;
    TargetingAttributes : TargetingSpec;
    TrackingUrls : TrackingUrls;
    AdAccountId : string;
    CreatedTime : int;
    Id : string;
    Sizing : TargetingTemplateAudienceSizing;
    Status : StatusEnum;
    UpdatedTime : int;
    Valid : bool option;
  }
  //#endregion
