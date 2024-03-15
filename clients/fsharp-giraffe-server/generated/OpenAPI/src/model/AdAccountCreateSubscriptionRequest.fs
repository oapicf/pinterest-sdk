namespace OpenAPI.Model

open System
open System.Collections.Generic

module AdAccountCreateSubscriptionRequest =

  //#region AdAccountCreateSubscriptionRequest


  type AdAccountCreateSubscriptionRequest = {
    WebhookUrl : string;
    LeadFormId : string;
    PartnerAccessToken : string;
    PartnerRefreshToken : string;
  }
  //#endregion
