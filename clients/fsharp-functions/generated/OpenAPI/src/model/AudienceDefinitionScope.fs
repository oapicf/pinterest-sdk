namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudienceDefinitionScope =

  //#region AudienceDefinitionScope

  [<CLIMutable>]
  type AudienceDefinitionScope = {
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
