namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateMemberResult

module UpdateMemberResultsResponseArray =

  //#region UpdateMemberResultsResponseArray

  [<CLIMutable>]
  type UpdateMemberResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdateMemberResult[];
  }

  //#endregion
