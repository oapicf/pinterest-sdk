namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module AdAccountGetSubscriptionResponse =

  //#region AdAccountGetSubscriptionResponse

  [<CLIMutable>]
  type AdAccountGetSubscriptionResponse = {
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string option;
    [<JsonProperty(PropertyName = "webhook_url")>]
    WebhookUrl : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "user_account_id")>]
    UserAccountId : string;
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "api_version")>]
    ApiVersion : string;
    [<JsonProperty(PropertyName = "cryptographic_key")>]
    CryptographicKey : string option;
    [<JsonProperty(PropertyName = "cryptographic_algorithm")>]
    CryptographicAlgorithm : string option;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
  }

  //#endregion
