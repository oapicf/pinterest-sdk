namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.PinterestTagEventData

module AudienceRule =

  //#region AudienceRule


  type AudienceRule = {
    Country : string;
    CustomerListId : string;
    EngagementDomain : string[];
    EngagementType : string;
    Event : string;
    EventData : PinterestTagEventData;
    Percentage : int;
    PinId : string[];
    Prefill : bool;
    RetentionDays : int;
    SeedId : string[];
    Url : string[];
    VisitorSourceId : string;
    EventSource : obj;
    IngestionSource : obj;
    EngagerType : int;
    CampaignId : string[];
    AdId : string[];
    ObjectiveType : ObjectiveType[];
    AdAccountId : string;
  }
  //#endregion
