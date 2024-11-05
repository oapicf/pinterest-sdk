namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AdAccountCreateSubscriptionResponse =

  //#region AdAccountCreateSubscriptionResponse


  type AdAccountCreateSubscriptionResponse = {
    Id : string;
    CryptographicKey : string option;
    CryptographicAlgorithm : string option;
    CreatedTime : int;
  }
  //#endregion
