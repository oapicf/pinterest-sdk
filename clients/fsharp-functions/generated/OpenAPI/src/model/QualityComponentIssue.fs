namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module QualityComponentIssue =

  //#region QualityComponentIssue

  [<CLIMutable>]
  type QualityComponentIssue = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
  }

  //#endregion
