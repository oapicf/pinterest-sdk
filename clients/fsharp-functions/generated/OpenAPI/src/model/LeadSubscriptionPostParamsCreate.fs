namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PartnerMetadata

module LeadSubscriptionPostParamsCreate =

  //#region LeadSubscriptionPostParamsCreate

  [<CLIMutable>]
  type LeadSubscriptionPostParamsCreate = {
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string;
    [<JsonProperty(PropertyName = "webhook_url")>]
    WebhookUrl : string;
    [<JsonProperty(PropertyName = "partner_access_token")>]
    PartnerAccessToken : string;
    [<JsonProperty(PropertyName = "partner_metadata")>]
    PartnerMetadata : PartnerMetadata;
    [<JsonProperty(PropertyName = "partner_refresh_token")>]
    PartnerRefreshToken : string;
  }

  //#endregion
