namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SSIOAccountPMPName =

  //#region SSIOAccountPMPName

  [<CLIMutable>]
  type SSIOAccountPMPName = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
