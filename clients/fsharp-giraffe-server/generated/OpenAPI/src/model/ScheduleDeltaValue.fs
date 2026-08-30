namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BidOptionsAgeBucketMultipliers
open OpenAPI.Model.BidOptionsAppTypeMultipliers
open OpenAPI.Model.BidOptionsAudienceMultipliers
open OpenAPI.Model.BidOptionsGenderMultipliers
open OpenAPI.Model.BidOptionsPlacementMultipliers
open OpenAPI.Model.ScheduleBidMultipliers

module ScheduleDeltaValue =

  //#region ScheduleDeltaValue


  type Schedule_delta_value = {
    AgeBucketMultipliers : BidOptionsAgeBucketMultipliers;
    AppTypeMultipliers : BidOptionsAppTypeMultipliers;
    AudienceMultipliers : BidOptionsAudienceMultipliers[];
    GenderMultipliers : BidOptionsGenderMultipliers;
    PlacementMultipliers : BidOptionsPlacementMultipliers;
  }
  //#endregion
