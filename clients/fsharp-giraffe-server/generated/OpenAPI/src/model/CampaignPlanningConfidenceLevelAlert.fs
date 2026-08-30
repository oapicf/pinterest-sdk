namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CampaignPlanningConfidenceLevelAlertReason
open OpenAPI.Model.CampaignPlanningConfidenceLevelAlertSeverity

module CampaignPlanningConfidenceLevelAlert =

  //#region CampaignPlanningConfidenceLevelAlert


  type CampaignPlanningConfidenceLevelAlert = {
    Description : string;
    Reason : CampaignPlanningConfidenceLevelAlertReason;
    Severity : CampaignPlanningConfidenceLevelAlertSeverity;
  }
  //#endregion
