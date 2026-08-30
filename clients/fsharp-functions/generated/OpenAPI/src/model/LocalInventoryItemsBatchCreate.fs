namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LocalInventoryOperation

module LocalInventoryItemsBatchCreate =

  //#region LocalInventoryItemsBatchCreate

  [<CLIMutable>]
  type LocalInventoryItemsBatchCreate = {
    [<JsonProperty(PropertyName = "operations")>]
    Operations : LocalInventoryOperation[];
  }

  //#endregion
