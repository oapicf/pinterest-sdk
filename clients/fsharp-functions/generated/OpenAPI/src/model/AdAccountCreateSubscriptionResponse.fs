namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdAccountCreateSubscriptionResponse =

  //#region AdAccountCreateSubscriptionResponse

  [<CLIMutable>]
  type AdAccountCreateSubscriptionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "cryptographic_key")>]
    CryptographicKey : string;
    [<JsonProperty(PropertyName = "cryptographic_algorithm")>]
    CryptographicAlgorithm : string;
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : int;
  }

  //#endregion
