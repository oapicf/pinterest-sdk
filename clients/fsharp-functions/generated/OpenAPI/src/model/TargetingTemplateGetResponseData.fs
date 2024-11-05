namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingTemplateAudienceSizing
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.bool option

module TargetingTemplateGetResponseData =

  //#region TargetingTemplateGetResponseData

  [<CLIMutable>]
  type TargetingTemplateGetResponseData = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "targeting_attributes")>]
    TargetingAttributes : TargetingSpec;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : TargetingTemplateKeyword[];
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : int;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "sizing")>]
    Sizing : TargetingTemplateAudienceSizing;
    [<JsonProperty(PropertyName = "valid")>]
    Valid : bool option;
  }

  //#endregion
