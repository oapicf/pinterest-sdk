namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessAccessUserSummary

module UserSingleAssetBinding =

  //#region UserSingleAssetBinding

  [<CLIMutable>]
  type UserSingleAssetBinding = {
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
  }

  //#endregion
