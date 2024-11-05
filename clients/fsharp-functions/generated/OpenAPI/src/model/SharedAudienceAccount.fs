namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SharedAudienceAccount =

  //#region SharedAudienceAccount

  [<CLIMutable>]
  type SharedAudienceAccount = {
    [<JsonProperty(PropertyName = "account_id")>]
    AccountId : string;
    [<JsonProperty(PropertyName = "account_name")>]
    AccountName : string;
    [<JsonProperty(PropertyName = "account_type")>]
    AccountType : string;
    [<JsonProperty(PropertyName = "shared_on_timestamp")>]
    SharedOnTimestamp : int;
  }

  //#endregion
