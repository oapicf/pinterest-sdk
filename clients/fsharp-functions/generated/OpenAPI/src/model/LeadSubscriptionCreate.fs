namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadSubscriptionCreate =

  //#region LeadSubscriptionCreate

  [<CLIMutable>]
  type LeadSubscriptionCreate = {
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string;
    [<JsonProperty(PropertyName = "webhook_url")>]
    WebhookUrl : string;
  }

  //#endregion
