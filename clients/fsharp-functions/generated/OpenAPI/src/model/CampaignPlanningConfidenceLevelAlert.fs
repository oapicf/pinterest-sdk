namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CampaignPlanningConfidenceLevelAlertReason
open OpenAPI.Model.CampaignPlanningConfidenceLevelAlertSeverity

module CampaignPlanningConfidenceLevelAlert =

  //#region CampaignPlanningConfidenceLevelAlert

  [<CLIMutable>]
  type CampaignPlanningConfidenceLevelAlert = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : CampaignPlanningConfidenceLevelAlertReason;
    [<JsonProperty(PropertyName = "severity")>]
    Severity : CampaignPlanningConfidenceLevelAlertSeverity;
  }

  //#endregion
