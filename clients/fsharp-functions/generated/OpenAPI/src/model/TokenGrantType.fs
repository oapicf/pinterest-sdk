namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TokenGrantType =

  //#region TokenGrantType

  let AuthorizationCodeEnum = "authorization_code"
  let RefreshTokenEnum = "refresh_token"
  let ClientCredentialsEnum = "client_credentials"
  type TokenGrantType = string

  //#endregion
