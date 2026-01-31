namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountCreateSubscriptionRequestPartnerMetadata

module AdAccountCreateSubscriptionRequest =

  //#region AdAccountCreateSubscriptionRequest

  [<CLIMutable>]
  type AdAccountCreateSubscriptionRequest = {
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string;
    [<JsonProperty(PropertyName = "partner_access_token")>]
    PartnerAccessToken : string;
    [<JsonProperty(PropertyName = "partner_metadata")>]
    PartnerMetadata : AdAccountCreateSubscriptionRequestPartnerMetadata;
    [<JsonProperty(PropertyName = "partner_refresh_token")>]
    PartnerRefreshToken : string;
    [<JsonProperty(PropertyName = "webhook_url")>]
    WebhookUrl : string;
  }

  //#endregion
