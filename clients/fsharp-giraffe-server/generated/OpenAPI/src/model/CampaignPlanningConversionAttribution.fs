namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningConversionAttributionWindowDays

module CampaignPlanningConversionAttribution =

  //#region CampaignPlanningConversionAttribution


  type CampaignPlanningConversionAttribution = {
    ClickWindowDays : CampaignPlanningConversionAttributionWindowDays;
    EngagementWindowDays : CampaignPlanningConversionAttributionWindowDays;
    ViewWindowDays : CampaignPlanningConversionAttributionWindowDays;
  }
  //#endregion
