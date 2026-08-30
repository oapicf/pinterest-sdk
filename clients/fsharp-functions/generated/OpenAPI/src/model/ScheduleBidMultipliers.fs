namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BidOptionsAgeBucketMultipliers
open OpenAPI.Model.BidOptionsAppTypeMultipliers
open OpenAPI.Model.BidOptionsAudienceMultipliers
open OpenAPI.Model.BidOptionsGenderMultipliers
open OpenAPI.Model.BidOptionsPlacementMultipliers

module ScheduleBidMultipliers =

  //#region ScheduleBidMultipliers

  [<CLIMutable>]
  type ScheduleBidMultipliers = {
    [<JsonProperty(PropertyName = "age_bucket_multipliers")>]
    AgeBucketMultipliers : BidOptionsAgeBucketMultipliers;
    [<JsonProperty(PropertyName = "app_type_multipliers")>]
    AppTypeMultipliers : BidOptionsAppTypeMultipliers;
    [<JsonProperty(PropertyName = "audience_multipliers")>]
    AudienceMultipliers : BidOptionsAudienceMultipliers[];
    [<JsonProperty(PropertyName = "gender_multipliers")>]
    GenderMultipliers : BidOptionsGenderMultipliers;
    [<JsonProperty(PropertyName = "placement_multipliers")>]
    PlacementMultipliers : BidOptionsPlacementMultipliers;
  }

  //#endregion
