namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BoardSectionCreate =

  //#region BoardSectionCreate

  [<CLIMutable>]
  type BoardSectionCreate = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
