namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.TargetingTemplateAudienceSizing
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TargetingTemplateStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option

module TargetingTemplate =

  //#region TargetingTemplate


  type TargetingTemplate = {
    AdAccountId : string;
    AutoTargetingEnabled : bool;
    CreatedTime : int;
    Id : string;
    Keywords : TargetingTemplateKeyword[];
    Name : string;
    PlacementGroup : PlacementGroupType;
    Sizing : TargetingTemplateAudienceSizing;
    Status : TargetingTemplateStatus;
    TargetingAttributes : TargetingSpecOptimal;
    TrackingUrls : TrackingUrls;
    UpdatedTime : int;
    Valid : bool option;
  }
  //#endregion
