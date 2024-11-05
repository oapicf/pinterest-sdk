namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OauthAccessTokenResponseRefresh =

  //#region OauthAccessTokenResponseRefresh

  [<CLIMutable>]
  type OauthAccessTokenResponseRefresh = {
    [<JsonProperty(PropertyName = "response_type")>]
    ResponseType : string;
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
    [<JsonProperty(PropertyName = "expires_in")>]
    ExpiresIn : int;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
