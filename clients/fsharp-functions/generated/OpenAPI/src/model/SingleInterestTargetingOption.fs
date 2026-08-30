namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SingleInterestTargetingOption =

  //#region SingleInterestTargetingOption

  [<CLIMutable>]
  type SingleInterestTargetingOption = {
    [<JsonProperty(PropertyName = "child_interests")>]
    ChildInterests : string[];
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "level")>]
    Level : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
