namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningConversionAttribution
open OpenAPI.Model.CampaignPlanningConversionEvent

module CampaignPlanningConversionRate =

  //#region CampaignPlanningConversionRate


  type CampaignPlanningConversionRate = {
    AttributionWindows : CampaignPlanningConversionAttribution;
    ConversionEvent : CampaignPlanningConversionEvent;
    ConversionRate : float;
  }
  //#endregion
