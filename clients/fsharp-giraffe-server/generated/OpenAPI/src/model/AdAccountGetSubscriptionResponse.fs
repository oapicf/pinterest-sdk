namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AdAccountGetSubscriptionResponse =

  //#region AdAccountGetSubscriptionResponse


  type AdAccountGetSubscriptionResponse = {
    LeadFormId : string option;
    WebhookUrl : string;
    Id : string;
    UserAccountId : string;
    AdAccountId : string;
    ApiVersion : string;
    CryptographicKey : string;
    CryptographicAlgorithm : string;
    CreatedTime : int;
  }
  //#endregion
