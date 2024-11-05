namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpec
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls

module TargetingTemplateCreate =

  //#region TargetingTemplateCreate


  type TargetingTemplateCreate = {
    Name : string;
    AutoTargetingEnabled : bool;
    TargetingAttributes : TargetingSpec;
    PlacementGroup : PlacementGroupType;
    Keywords : TargetingTemplateKeyword[];
    TrackingUrls : TrackingUrls;
  }
  //#endregion
