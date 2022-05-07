namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module BoardUpdate =

  //#region BoardUpdate

  [<CLIMutable>]
  type BoardUpdate = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : string;
  }

  //#endregion
