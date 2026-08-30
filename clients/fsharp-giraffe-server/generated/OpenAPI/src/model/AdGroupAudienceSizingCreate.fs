namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupAudienceSizingCreativeTypes
open OpenAPI.Model.AdGroupAudienceSizingKeyword
open OpenAPI.Model.AdgroupPlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal

module AdGroupAudienceSizingCreate =

  //#region AdGroupAudienceSizingCreate


  type AdGroupAudienceSizingCreate = {
    AutoTargetingEnabled : bool;
    CreativeTypes : AdGroupAudienceSizingCreativeTypes[];
    Keywords : AdGroupAudienceSizingKeyword[];
    PlacementGroup : AdgroupPlacementGroupType;
    ProductGroupIds : string[];
    TargetingSpec : TargetingSpecOptimal;
  }
  //#endregion
