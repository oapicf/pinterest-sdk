namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PartnerMetadata
open OpenAPI.Model.string option

module LeadSubscriptionPostParams =

  //#region LeadSubscriptionPostParams

  [<CLIMutable>]
  type LeadSubscriptionPostParams = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "api_version")>]
    ApiVersion : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
    [<JsonProperty(PropertyName = "cryptographic_algorithm")>]
    CryptographicAlgorithm : string option;
    [<JsonProperty(PropertyName = "cryptographic_key")>]
    CryptographicKey : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string option;
    [<JsonProperty(PropertyName = "user_account_id")>]
    UserAccountId : string;
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
