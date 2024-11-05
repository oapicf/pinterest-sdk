namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module AdAccountCreateSubscriptionResponse =

  //#region AdAccountCreateSubscriptionResponse

  [<CLIMutable>]
  type AdAccountCreateSubscriptionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "cryptographic_key")>]
    CryptographicKey : string option;
    [<JsonProperty(PropertyName = "cryptographic_algorithm")>]
    CryptographicAlgorithm : string option;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
  }

  //#endregion
