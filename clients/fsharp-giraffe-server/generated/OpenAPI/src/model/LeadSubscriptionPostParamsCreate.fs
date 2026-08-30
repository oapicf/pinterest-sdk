namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PartnerMetadata

module LeadSubscriptionPostParamsCreate =

  //#region LeadSubscriptionPostParamsCreate


  type LeadSubscriptionPostParamsCreate = {
    LeadFormId : string;
    WebhookUrl : string;
    PartnerAccessToken : string;
    PartnerMetadata : PartnerMetadata;
    PartnerRefreshToken : string;
  }
  //#endregion
