namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SingleInterestTargetingOptionResponse =

  //#region SingleInterestTargetingOptionResponse

  [<CLIMutable>]
  type SingleInterestTargetingOptionResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "child_interests")>]
    ChildInterests : string[];
    [<JsonProperty(PropertyName = "level")>]
    Level : int;
  }

  //#endregion
