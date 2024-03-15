namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedCredentials =

  //#region CatalogsFeedCredentials

  [<CLIMutable>]
  type CatalogsFeedCredentials = {
    [<JsonProperty(PropertyName = "password")>]
    Password : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
