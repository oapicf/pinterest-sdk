namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BrandAccountsCreate200Response =

  //#region BrandAccountsCreate200Response

  [<CLIMutable>]
  type BrandAccountsCreate200Response = {
    [<JsonProperty(PropertyName = "brand_account_id")>]
    BrandAccountId : string;
  }

  //#endregion
