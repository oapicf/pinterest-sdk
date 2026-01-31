namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AdAccountCreateSubscriptionResponse =

  //#region AdAccountCreateSubscriptionResponse


  type AdAccountCreateSubscriptionResponse = {
    AdAccountId : string;
    ApiVersion : string;
    CreatedTime : int;
    CryptographicAlgorithm : string option;
    CryptographicKey : string option;
    Id : string;
    LeadFormId : string option;
    UserAccountId : string;
    WebhookUrl : string;
  }
  //#endregion
