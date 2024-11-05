namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenRequestCode =

  //#region OauthAccessTokenRequestCode

  [<CLIMutable>]
  type OauthAccessTokenRequestCode = {
    [<JsonProperty(PropertyName = "grant_type")>]
    GrantType : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "redirect_uri")>]
    RedirectUri : string;
  }

  //#endregion
