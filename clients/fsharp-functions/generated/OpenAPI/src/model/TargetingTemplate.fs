namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.TargetingTemplateAudienceSizing
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TargetingTemplateStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option

module TargetingTemplate =

  //#region TargetingTemplate

  [<CLIMutable>]
  type TargetingTemplate = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : TargetingTemplateKeyword[];
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "sizing")>]
    Sizing : TargetingTemplateAudienceSizing;
    [<JsonProperty(PropertyName = "status")>]
    Status : TargetingTemplateStatus;
    [<JsonProperty(PropertyName = "targeting_attributes")>]
    TargetingAttributes : TargetingSpecOptimal;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "valid")>]
    Valid : bool option;
  }

  //#endregion
