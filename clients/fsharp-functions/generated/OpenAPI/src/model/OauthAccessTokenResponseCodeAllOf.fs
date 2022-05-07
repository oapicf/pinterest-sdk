namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenResponseCodeAllOf =

  //#region OauthAccessTokenResponseCodeAllOf

  [<CLIMutable>]
  type OauthAccessTokenResponseCodeAllOf = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
  }

  //#endregion
