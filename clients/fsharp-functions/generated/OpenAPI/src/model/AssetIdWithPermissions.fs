namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssetIdWithPermissions =

  //#region AssetIdWithPermissions

  [<CLIMutable>]
  type AssetIdWithPermissions = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
