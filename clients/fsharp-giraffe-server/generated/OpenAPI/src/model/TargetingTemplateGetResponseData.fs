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
    Valid : bool option;
  }
  //#endregion
