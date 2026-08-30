namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BrandAccount =

  //#region BrandAccount

  [<CLIMutable>]
  type BrandAccount = {
    [<JsonProperty(PropertyName = "brand_account_id")>]
    BrandAccountId : string;
  }

  //#endregion
