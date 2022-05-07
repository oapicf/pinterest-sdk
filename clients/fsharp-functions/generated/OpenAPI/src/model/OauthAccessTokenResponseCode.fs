namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OauthAccessTokenResponse
open OpenAPI.Model.OauthAccessTokenResponseCodeAllOf

module OauthAccessTokenResponseCode =

  //#region OauthAccessTokenResponseCode

  [<CLIMutable>]
  type OauthAccessTokenResponseCode = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
  }

  //#endregion
