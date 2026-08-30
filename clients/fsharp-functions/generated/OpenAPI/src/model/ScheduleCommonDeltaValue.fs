namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ScheduleAgeBucketMultipliers
open OpenAPI.Model.ScheduleAppTypeMultipliers
open OpenAPI.Model.ScheduleAudienceMultipliers
open OpenAPI.Model.ScheduleBidOptions
open OpenAPI.Model.ScheduleBidOptionsGenderMultipliers
open OpenAPI.Model.ScheduleBidOptionsPlacementMultipliers

module ScheduleCommonDeltaValue =

  //#region ScheduleCommonDeltaValue

  [<CLIMutable>]
  type ScheduleCommonDeltaValue = {
    [<JsonProperty(PropertyName = "age_bucket_multipliers")>]
    AgeBucketMultipliers : ScheduleAgeBucketMultipliers;
    [<JsonProperty(PropertyName = "app_type_multipliers")>]
    AppTypeMultipliers : ScheduleAppTypeMultipliers;
    [<JsonProperty(PropertyName = "audience_multipliers")>]
    AudienceMultipliers : ScheduleAudienceMultipliers;
    [<JsonProperty(PropertyName = "gender_multipliers")>]
    GenderMultipliers : ScheduleBidOptionsGenderMultipliers;
    [<JsonProperty(PropertyName = "placement_multipliers")>]
    PlacementMultipliers : ScheduleBidOptionsPlacementMultipliers;
  }

  //#endregion
