namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionAccessToken =

  //#region ConversionAccessToken

  [<CLIMutable>]
  type ConversionAccessToken = {
    [<JsonProperty(PropertyName = "access_token")>]
    AccessToken : string;
    [<JsonProperty(PropertyName = "token_type")>]
    TokenType : string;
  }

  //#endregion
