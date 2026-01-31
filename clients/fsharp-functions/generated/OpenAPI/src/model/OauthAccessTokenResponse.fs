namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenResponse =

  //#region OauthAccessTokenResponse

  [<CLIMutable>]
  type OauthAccessTokenResponse = {
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "expires_in")>]
    ExpiresIn : int;
    [<JsonProperty(PropertyName = "response_type")>]
    ResponseType : string;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
  }

  //#endregion
