namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupAudienceSizingRequestKeywordsInner
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec

module AdGroupAudienceSizingRequest =

  //#region AdGroupAudienceSizingRequest

  [<CLIMutable>]
  type AdGroupAudienceSizingRequest = {
    [<JsonProperty(PropertyName = "auto_targeting_enabled")>]
    AutoTargetingEnabled : bool;
    [<JsonProperty(PropertyName = "placement_group")>]
    PlacementGroup : PlacementGroupType;
    [<JsonProperty(PropertyName = "creative_types")>]
    CreativeTypes : string[];
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpec;
    [<JsonProperty(PropertyName = "product_group_ids")>]
    ProductGroupIds : string[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : AdGroupAudienceSizingRequestKeywordsInner[];
  }

  //#endregion
