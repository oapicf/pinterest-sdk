namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls

module TargetingTemplateCreate =

  //#region TargetingTemplateCreate

  [<CLIMutable>]
  type TargetingTemplateCreate = {
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : TargetingTemplateKeyword[];
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "targeting_attributes")>]
    TargetingAttributes : TargetingSpecOptimal;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
  }

  //#endregion
