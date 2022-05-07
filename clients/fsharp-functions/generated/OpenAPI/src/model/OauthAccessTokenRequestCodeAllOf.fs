namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequestCodeAllOf =

  //#region OauthAccessTokenRequestCodeAllOf

  [<CLIMutable>]
  type OauthAccessTokenRequestCodeAllOf = {
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "redirect_uri")>]
    RedirectUri : string;
  }

  //#endregion
