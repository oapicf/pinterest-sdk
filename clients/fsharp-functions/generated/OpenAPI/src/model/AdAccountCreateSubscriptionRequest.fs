namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdAccountCreateSubscriptionRequest =

  //#region AdAccountCreateSubscriptionRequest

  [<CLIMutable>]
  type AdAccountCreateSubscriptionRequest = {
    [<JsonProperty(PropertyName = "webhook_url")>]
    WebhookUrl : string;
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string;
    [<JsonProperty(PropertyName = "partner_access_token")>]
    PartnerAccessToken : string;
    [<JsonProperty(PropertyName = "partner_refresh_token")>]
    PartnerRefreshToken : string;
  }

  //#endregion
