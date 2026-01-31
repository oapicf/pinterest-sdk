namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EventData
open OpenAPI.Model.ObjectiveType

module AudienceRule =

  //#region AudienceRule


  type AudienceRule = {
    AdAccountId : string;
    AdId : string[];
    CampaignId : string[];
    Country : string;
    CustomerListId : string;
    EngagementDomain : string[];
    EngagementType : string;
    EngagerType : int;
    Event : string;
    EventData : EventData;
    EventSource : obj;
    IngestionSource : obj;
    ObjectiveType : ObjectiveType[];
    Percentage : int;
    PinId : string[];
    Prefill : bool;
    RetentionDays : int;
    SeedId : string[];
    Url : string[];
    VisitorSourceId : string;
  }
  //#endregion
