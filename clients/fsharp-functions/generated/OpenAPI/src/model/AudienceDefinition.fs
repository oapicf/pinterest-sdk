namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module AudienceDefinition =

  //#region AudienceDefinition

  [<CLIMutable>]
  type AudienceDefinition = {
    [<JsonProperty(PropertyName = "date")>]
    Date : string option;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
