namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupCurrencyCriteria

module ItemIdFilter =

  //#region ItemIdFilter

  [<CLIMutable>]
  type ItemIdFilter = {
    [<JsonProperty(PropertyName = "ITEM_ID")>]
    ITEM_ID : CatalogsProductGroupCurrencyCriteria;
  }

  //#endregion
