namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BoardSectionUpdateWithRequiredBody =

  //#region BoardSectionUpdateWithRequiredBody

  [<CLIMutable>]
  type BoardSectionUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
