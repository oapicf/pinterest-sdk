namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ScheduleAgeBucketMultipliers
open OpenAPI.Model.ScheduleAppTypeMultipliers
open OpenAPI.Model.ScheduleAudienceMultipliers
open OpenAPI.Model.ScheduleBidOptions
open OpenAPI.Model.ScheduleBidOptionsGenderMultipliers
open OpenAPI.Model.ScheduleBidOptionsPlacementMultipliers

module ScheduleCommonDeltaValue =

  //#region ScheduleCommonDeltaValue


  type ScheduleCommonDeltaValue = {
    AgeBucketMultipliers : ScheduleAgeBucketMultipliers;
    AppTypeMultipliers : ScheduleAppTypeMultipliers;
    AudienceMultipliers : ScheduleAudienceMultipliers;
    GenderMultipliers : ScheduleBidOptionsGenderMultipliers;
    PlacementMultipliers : ScheduleBidOptionsPlacementMultipliers;
  }
  //#endregion
