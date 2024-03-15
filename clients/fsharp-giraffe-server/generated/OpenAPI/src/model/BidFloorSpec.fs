namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.Country
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Currency
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.OptimizationGoalMetadata

module BidFloorSpec =

  //#region BidFloorSpec


  type BidFloorSpec = {
    Countries : Country[];
    Currency : Currency;
    ObjectiveType : ObjectiveType;
    BillableEvent : ActionType;
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    CreativeType : CreativeType;
  }
  //#endregion
