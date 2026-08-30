namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BidOptionsAgeBucketMultipliers
open OpenAPI.Model.BidOptionsAppTypeMultipliers
open OpenAPI.Model.BidOptionsAudienceMultipliers
open OpenAPI.Model.BidOptionsGenderMultipliers
open OpenAPI.Model.BidOptionsPlacementMultipliers

module ScheduleBidMultipliers =

  //#region ScheduleBidMultipliers


  type ScheduleBidMultipliers = {
    AgeBucketMultipliers : BidOptionsAgeBucketMultipliers;
    AppTypeMultipliers : BidOptionsAppTypeMultipliers;
    AudienceMultipliers : BidOptionsAudienceMultipliers[];
    GenderMultipliers : BidOptionsGenderMultipliers;
    PlacementMultipliers : BidOptionsPlacementMultipliers;
  }
  //#endregion
