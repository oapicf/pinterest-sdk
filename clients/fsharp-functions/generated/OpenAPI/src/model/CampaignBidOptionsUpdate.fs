namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.CampaignAudienceMultipliers
open OpenAPI.Model.PlacementMultipliers

module CampaignBidOptionsUpdate =

  //#region CampaignBidOptionsUpdate

  [<CLIMutable>]
  type CampaignBidOptionsUpdate = {
    [<JsonProperty(PropertyName = "app_type_multipliers")>]
    AppTypeMultipliers : AppTypeMultipliers;
    [<JsonProperty(PropertyName = "audience_multipliers")>]
    AudienceMultipliers : CampaignAudienceMultipliers;
    [<JsonProperty(PropertyName = "placement_multipliers")>]
    PlacementMultipliers : PlacementMultipliers;
    [<JsonProperty(PropertyName = "update_mask")>]
    UpdateMask : string[];
  }

  //#endregion
