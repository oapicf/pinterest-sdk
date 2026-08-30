namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ActionType
open OpenAPI.Model.BidFloorObjectiveType
open OpenAPI.Model.Country
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Currency
open OpenAPI.Model.OptimizationGoalMetadata

module BidFloorSpec =

  //#region BidFloorSpec


  type BidFloorSpec = {
    BillableEvent : ActionType;
    Countries : Country[];
    CreativeType : CreativeType;
    Currency : Currency;
    ObjectiveType : BidFloorObjectiveType;
    OptimizationGoalMetadata : OptimizationGoalMetadata;
  }
  //#endregion
