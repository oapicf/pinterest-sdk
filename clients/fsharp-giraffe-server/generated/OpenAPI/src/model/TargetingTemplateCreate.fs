namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PlacementGroupType
open OpenAPI.Model.TargetingSpecOptimal
open OpenAPI.Model.TargetingTemplateKeyword
open OpenAPI.Model.TrackingUrls

module TargetingTemplateCreate =

  //#region TargetingTemplateCreate


  type TargetingTemplateCreate = {
    AutoTargetingEnabled : bool;
    Keywords : TargetingTemplateKeyword[];
    Name : string;
    PlacementGroup : PlacementGroupType;
    TargetingAttributes : TargetingSpecOptimal;
    TrackingUrls : TrackingUrls;
  }
  //#endregion
