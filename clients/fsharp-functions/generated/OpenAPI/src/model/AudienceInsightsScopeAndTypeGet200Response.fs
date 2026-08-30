namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceDefinition

module AudienceInsightsScopeAndTypeGet200Response =

  //#region AudienceInsightsScopeAndTypeGet200Response

  [<CLIMutable>]
  type AudienceInsightsScopeAndTypeGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AudienceDefinition[];
  }

  //#endregion
