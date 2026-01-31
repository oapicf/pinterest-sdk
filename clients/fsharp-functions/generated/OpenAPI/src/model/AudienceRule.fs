namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EventData
open OpenAPI.Model.ObjectiveType

module AudienceRule =

  //#region AudienceRule

  [<CLIMutable>]
  type AudienceRule = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "ad_id")>]
    AdId : string[];
    [<JsonProperty(PropertyName = "campaign_id")>]
    CampaignId : string[];
    [<JsonProperty(PropertyName = "country")>]
    Country : string;
    [<JsonProperty(PropertyName = "customer_list_id")>]
    CustomerListId : string;
    [<JsonProperty(PropertyName = "engagement_domain")>]
    EngagementDomain : string[];
    [<JsonProperty(PropertyName = "engagement_type")>]
    EngagementType : string;
    [<JsonProperty(PropertyName = "engager_type")>]
    EngagerType : int;
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "event_data")>]
    EventData : EventData;
    [<JsonProperty(PropertyName = "event_source")>]
    EventSource : obj;
    [<JsonProperty(PropertyName = "ingestion_source")>]
    IngestionSource : obj;
    [<JsonProperty(PropertyName = "objective_type")>]
    ObjectiveType : ObjectiveType[];
    [<JsonProperty(PropertyName = "percentage")>]
    Percentage : int;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string[];
    [<JsonProperty(PropertyName = "prefill")>]
    Prefill : bool;
    [<JsonProperty(PropertyName = "retention_days")>]
    RetentionDays : int;
    [<JsonProperty(PropertyName = "seed_id")>]
    SeedId : string[];
    [<JsonProperty(PropertyName = "url")>]
    Url : string[];
    [<JsonProperty(PropertyName = "visitor_source_id")>]
    VisitorSourceId : string;
  }

  //#endregion
