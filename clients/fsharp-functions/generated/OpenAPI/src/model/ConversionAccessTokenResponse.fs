namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionAccessTokenResponse =

  //#region ConversionAccessTokenResponse

  [<CLIMutable>]
  type ConversionAccessTokenResponse = {
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
  }

  //#endregion
