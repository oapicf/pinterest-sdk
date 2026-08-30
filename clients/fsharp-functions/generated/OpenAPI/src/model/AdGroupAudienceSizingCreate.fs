namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupAudienceSizingCreativeTypes
open OpenAPI.Model.AdGroupAudienceSizingKeyword
open OpenAPI.Model.AdgroupPlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal

module AdGroupAudienceSizingCreate =

  //#region AdGroupAudienceSizingCreate

  [<CLIMutable>]
  type AdGroupAudienceSizingCreate = {
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "creative_types")>]
    CreativeTypes : AdGroupAudienceSizingCreativeTypes[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : AdGroupAudienceSizingKeyword[];
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : AdgroupPlacementGroupType;
    [<JsonProperty(PropertyName = "product_group_ids")>]
    ProductGroupIds : string[];
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpecOptimal;
  }

  //#endregion
