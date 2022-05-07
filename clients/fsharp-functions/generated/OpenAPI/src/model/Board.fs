namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.string option

module Board =

  //#region Board

  [<CLIMutable>]
  type Board = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : BoardOwner;
    [<JsonProperty(PropertyName = "privacy")>]
    Privacy : string;
  }

  //#endregion
