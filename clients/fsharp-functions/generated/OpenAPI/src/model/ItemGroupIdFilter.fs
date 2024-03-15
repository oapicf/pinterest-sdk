namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module ItemGroupIdFilter =

  //#region ItemGroupIdFilter

  [<CLIMutable>]
  type ItemGroupIdFilter = {
    [<JsonProperty(PropertyName = "ITEM_GROUP_ID")>]
    ITEM_GROUP_ID : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
