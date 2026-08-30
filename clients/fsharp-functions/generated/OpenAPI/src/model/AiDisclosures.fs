namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AiDisclosureItem

module AiDisclosures =

  //#region AiDisclosures

  [<CLIMutable>]
  type AiDisclosures = {
    [<JsonProperty(PropertyName = "values")>]
    Values : AiDisclosureItem[];
  }

  //#endregion
