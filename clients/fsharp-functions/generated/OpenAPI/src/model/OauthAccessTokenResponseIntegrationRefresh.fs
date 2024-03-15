namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OauthAccessTokenResponse

module OauthAccessTokenResponseIntegrationRefresh =

  //#region OauthAccessTokenResponseIntegrationRefresh

  [<CLIMutable>]
  type OauthAccessTokenResponseIntegrationRefresh = {
    [<JsonProperty(PropertyName = "refresh_token")>]
    RefreshToken : string;
    [<JsonProperty(PropertyName = "refresh_token_expires_in")>]
    RefreshTokenExpiresIn : int;
  }

  //#endregion
