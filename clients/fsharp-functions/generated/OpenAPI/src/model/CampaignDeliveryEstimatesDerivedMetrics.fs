namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CampaignDeliveryEstimatesDerivedMetrics =

  //#region CampaignDeliveryEstimatesDerivedMetrics

  [<CLIMutable>]
  type CampaignDeliveryEstimatesDerivedMetrics = {
    [<JsonProperty(PropertyName = "cpc")>]
    Cpc : float;
    [<JsonProperty(PropertyName = "cpc_lower")>]
    CpcLower : float;
    [<JsonProperty(PropertyName = "cpc_upper")>]
    CpcUpper : float;
    [<JsonProperty(PropertyName = "cpm")>]
    Cpm : float;
    [<JsonProperty(PropertyName = "cpm_lower")>]
    CpmLower : float;
    [<JsonProperty(PropertyName = "cpm_upper")>]
    CpmUpper : float;
    [<JsonProperty(PropertyName = "lifetime_frequency")>]
    LifetimeFrequency : float;
    [<JsonProperty(PropertyName = "lifetime_frequency_lower")>]
    LifetimeFrequencyLower : float;
    [<JsonProperty(PropertyName = "lifetime_frequency_upper")>]
    LifetimeFrequencyUpper : float;
    [<JsonProperty(PropertyName = "lifetime_impression")>]
    LifetimeImpression : float;
    [<JsonProperty(PropertyName = "lifetime_impression_lower")>]
    LifetimeImpressionLower : float;
    [<JsonProperty(PropertyName = "lifetime_impression_upper")>]
    LifetimeImpressionUpper : float;
    [<JsonProperty(PropertyName = "lifetime_reach")>]
    LifetimeReach : float;
    [<JsonProperty(PropertyName = "lifetime_reach_lower")>]
    LifetimeReachLower : float;
    [<JsonProperty(PropertyName = "lifetime_reach_upper")>]
    LifetimeReachUpper : float;
    [<JsonProperty(PropertyName = "weekly_click")>]
    WeeklyClick : float;
    [<JsonProperty(PropertyName = "weekly_click_lower")>]
    WeeklyClickLower : float;
    [<JsonProperty(PropertyName = "weekly_click_upper")>]
    WeeklyClickUpper : float;
    [<JsonProperty(PropertyName = "weekly_frequency")>]
    WeeklyFrequency : float;
    [<JsonProperty(PropertyName = "weekly_frequency_lower")>]
    WeeklyFrequencyLower : float;
    [<JsonProperty(PropertyName = "weekly_frequency_upper")>]
    WeeklyFrequencyUpper : float;
    [<JsonProperty(PropertyName = "weekly_impression")>]
    WeeklyImpression : float;
    [<JsonProperty(PropertyName = "weekly_impression_lower")>]
    WeeklyImpressionLower : float;
    [<JsonProperty(PropertyName = "weekly_impression_upper")>]
    WeeklyImpressionUpper : float;
    [<JsonProperty(PropertyName = "weekly_reach")>]
    WeeklyReach : float;
    [<JsonProperty(PropertyName = "weekly_reach_lower")>]
    WeeklyReachLower : float;
    [<JsonProperty(PropertyName = "weekly_reach_upper")>]
    WeeklyReachUpper : float;
  }

  //#endregion
