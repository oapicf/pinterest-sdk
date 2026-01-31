namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountCreateSubscriptionRequestPartnerMetadata

module AdAccountCreateSubscriptionRequest =

  //#region AdAccountCreateSubscriptionRequest


  type AdAccountCreateSubscriptionRequest = {
    LeadFormId : string;
    PartnerAccessToken : string;
    PartnerMetadata : AdAccountCreateSubscriptionRequestPartnerMetadata;
    PartnerRefreshToken : string;
    WebhookUrl : string;
  }
  //#endregion
