namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Account =

  //#region Account

  [<CLIMutable>]
  type Account = {
    [<JsonProperty(PropertyName = "account_type")>]
    AccountType : string;
    [<JsonProperty(PropertyName = "profile_image")>]
    ProfileImage : string;
    [<JsonProperty(PropertyName = "website_url")>]
    WebsiteUrl : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
