namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UpdatableItemAttributes
open OpenAPI.Model.UpdateMaskFieldType

module CatalogsUpdateRetailItem =

  //#region CatalogsUpdateRetailItem

  //#region enums
  type OperationEnum = UPDATEEnum of string  
  //#endregion

  type CatalogsUpdateRetailItem = {
    ItemId : string;
    Operation : OperationEnum;
    Attributes : UpdatableItemAttributes;
    UpdateMask : UpdateMaskFieldType[];
  }
  //#endregion
