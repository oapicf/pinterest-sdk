namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupAudienceSizingRequestKeywordsInner
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec

module AdGroupAudienceSizingRequest =

  //#region AdGroupAudienceSizingRequest

  //#region enums
  type CreativeTypesEnum[] = REGULAREnum of string[]  |  VIDEOEnum of string[]  |  SHOPPINGEnum of string[]  |  CAROUSELEnum of string[]  |  MAXVIDEOEnum of string[]  |  SHOPTHEPINEnum of string[]  |  COLLECTIONEnum of string[]  |  IDEAEnum of string[]  
  //#endregion

  type AdGroupAudienceSizingRequest = {
    AutoTargetingEnabled : bool;
    PlacementGroup : PlacementGroupType;
    CreativeTypes : CreativeTypesEnum[];
    TargetingSpec : TargetingSpec;
    ProductGroupIds : string[];
    Keywords : AdGroupAudienceSizingRequestKeywordsInner[];
  }
  //#endregion
