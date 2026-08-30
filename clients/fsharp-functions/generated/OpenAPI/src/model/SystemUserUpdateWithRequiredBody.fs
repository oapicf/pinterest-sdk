namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SystemUserUpdateWithRequiredBody =

  //#region SystemUserUpdateWithRequiredBody

  [<CLIMutable>]
  type SystemUserUpdateWithRequiredBody = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
