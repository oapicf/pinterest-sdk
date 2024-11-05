namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountCreateSubscriptionRequestPartnerMetadata

module AdAccountCreateSubscriptionRequest =

  //#region AdAccountCreateSubscriptionRequest


  type AdAccountCreateSubscriptionRequest = {
    WebhookUrl : string;
    LeadFormId : string;
    PartnerAccessToken : string;
    PartnerRefreshToken : string;
    PartnerMetadata : AdAccountCreateSubscriptionRequestPartnerMetadata;
  }
  //#endregion
