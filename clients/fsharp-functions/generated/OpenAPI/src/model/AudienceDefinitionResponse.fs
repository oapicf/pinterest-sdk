namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceDefinition

module AudienceDefinitionResponse =

  //#region AudienceDefinitionResponse

  [<CLIMutable>]
  type AudienceDefinitionResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AudienceDefinition[];
  }

  //#endregion
