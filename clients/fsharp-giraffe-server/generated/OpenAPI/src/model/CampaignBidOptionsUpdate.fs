namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AppTypeMultipliers
open OpenAPI.Model.CampaignAudienceMultipliers
open OpenAPI.Model.PlacementMultipliers

module CampaignBidOptionsUpdate =

  //#region CampaignBidOptionsUpdate

  //#region enums
  type UpdateMaskEnum[] = AUDIENCEEnum of string[]  |  APPTYPEEnum of string[]  |  PLACEMENTEnum of string[]  |  GENDEREnum of string[]  |  AGEBUCKETEnum of string[]  
  //#endregion

  type CampaignBidOptionsUpdate = {
    AppTypeMultipliers : AppTypeMultipliers;
    AudienceMultipliers : CampaignAudienceMultipliers;
    PlacementMultipliers : PlacementMultipliers;
    UpdateMask : UpdateMaskEnum[];
  }
  //#endregion
