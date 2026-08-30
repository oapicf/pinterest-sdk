namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AiDisclosureItem

module AiDisclosuresUpdate =

  //#region AiDisclosuresUpdate

  [<CLIMutable>]
  type AiDisclosuresUpdate = {
    [<JsonProperty(PropertyName = "values")>]
    Values : AiDisclosureItem[];
  }

  //#endregion
