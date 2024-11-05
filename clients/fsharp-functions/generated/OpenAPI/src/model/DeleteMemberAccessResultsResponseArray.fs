namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeleteMemberAccessResult

module DeleteMemberAccessResultsResponseArray =

  //#region DeleteMemberAccessResultsResponseArray

  [<CLIMutable>]
  type DeleteMemberAccessResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeleteMemberAccessResult[];
  }

  //#endregion
