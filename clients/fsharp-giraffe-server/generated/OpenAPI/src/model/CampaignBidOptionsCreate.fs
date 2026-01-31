namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.CampaignAudienceMultipliers
open OpenAPI.Model.PlacementMultipliers

module CampaignBidOptionsCreate =

  //#region CampaignBidOptionsCreate


  type CampaignBidOptionsCreate = {
    AppTypeMultipliers : AppTypeMultipliers;
    AudienceMultipliers : CampaignAudienceMultipliers;
    PlacementMultipliers : PlacementMultipliers;
  }
  //#endregion
