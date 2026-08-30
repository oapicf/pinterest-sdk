namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceObjectiveType
open OpenAPI.Model.EventData

module AdAccountsAudienceRule =

  //#region AdAccountsAudienceRule


  type AdAccountsAudienceRule = {
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
    ObjectiveType : AudienceObjectiveType[];
    Percentage : int;
    PinId : string[];
    Prefill : bool;
    RetentionDays : int;
    SeedId : string[];
    Url : string[];
    VisitorSourceId : string;
  }
  //#endregion
