namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemBatchRecord

module CatalogsItems =

  //#region CatalogsItems

  [<CLIMutable>]
  type CatalogsItems = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemBatchRecord[];
  }

  //#endregion
