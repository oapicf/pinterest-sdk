namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadSubscriptionPostParamsCreateAllOfPartnerMetadata

module LeadSubscriptionPostParamsCreate =

  //#region LeadSubscriptionPostParamsCreate


  type LeadSubscriptionPostParamsCreate = {
    LeadFormId : string;
    WebhookUrl : string;
    PartnerAccessToken : string;
    PartnerMetadata : LeadSubscriptionPostParamsCreateAllOfPartnerMetadata;
    PartnerRefreshToken : string;
  }
  //#endregion
