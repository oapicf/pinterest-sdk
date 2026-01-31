namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AdAccountGetSubscriptionResponse =

  //#region AdAccountGetSubscriptionResponse


  type AdAccountGetSubscriptionResponse = {
    LeadFormId : string option;
    WebhookUrl : string;
    AdAccountId : string;
    ApiVersion : string;
    CreatedTime : int;
    CryptographicAlgorithm : string option;
    CryptographicKey : string option;
    Id : string;
    UserAccountId : string;
  }
  //#endregion
