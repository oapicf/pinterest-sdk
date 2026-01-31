namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudienceDefinitionType =

  //#region AudienceDefinitionType

  [<CLIMutable>]
  type AudienceDefinitionType = {
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
  }

  //#endregion
