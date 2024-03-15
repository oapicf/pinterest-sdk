namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ActionType
open OpenAPI.Model.Country
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Currency
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.OptimizationGoalMetadata

module BidFloorSpec =

  //#region BidFloorSpec

  [<CLIMutable>]
  type BidFloorSpec = {
    [<JsonProperty(PropertyName = "countries")>]
    Countries : Country[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType;
    [<JsonProperty(PropertyName = "billable_event")>]
    BillableEvent : ActionType;
    [<JsonProperty(PropertyName = "optimization_goal_metadata")>]
    OptimizationGoalMetadata : OptimizationGoalMetadata;
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : CreativeType;
  }

  //#endregion
