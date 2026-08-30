namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TokenTypeHint =

  //#region TokenTypeHint

  let AccessTokenEnum = "access_token"
  let RefreshTokenEnum = "refresh_token"
  type TokenTypeHint = string

  //#endregion
