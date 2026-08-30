namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LocalInventoryOperation

module LocalInventoryItemsBatchCreate =

  //#region LocalInventoryItemsBatchCreate


  type LocalInventoryItemsBatchCreate = {
    Operations : LocalInventoryOperation[];
  }
  //#endregion
