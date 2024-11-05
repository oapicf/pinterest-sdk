namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls

module TargetingTemplateCommon =

  //#region TargetingTemplateCommon

  [<CLIMutable>]
  type TargetingTemplateCommon = {
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
  }

  //#endregion
