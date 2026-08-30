namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AgeBucketMultipliers
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.CampaignAudienceMultipliers
open OpenAPI.Model.CampaignBidOptionsUpdateMaskItems
open OpenAPI.Model.FreqBidMultiplierTimeWindow
open OpenAPI.Model.FrequencyMultipliers
open OpenAPI.Model.GenderMultipliers
open OpenAPI.Model.PlacementMultipliers

module CampaignBidOptionsUpdate =

  //#region CampaignBidOptionsUpdate


  type CampaignBidOptionsUpdate = {
    AgeBucketMultipliers : AgeBucketMultipliers;
    AppTypeMultipliers : AppTypeMultipliers;
    AudienceMultipliers : CampaignAudienceMultipliers;
    FreqBidMultiplierTimeWindow : FreqBidMultiplierTimeWindow;
    FrequencyMultipliers : FrequencyMultipliers;
    GenderMultipliers : GenderMultipliers;
    PlacementMultipliers : PlacementMultipliers;
    UpdateMask : CampaignBidOptionsUpdateMaskItems[];
  }
  //#endregion
