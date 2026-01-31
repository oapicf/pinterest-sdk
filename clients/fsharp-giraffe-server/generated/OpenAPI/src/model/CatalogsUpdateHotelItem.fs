namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsUpdatableHotelAttributes

module CatalogsUpdateHotelItem =

  //#region CatalogsUpdateHotelItem

  //#region enums
  type OperationEnum = UPDATEEnum of string  
  //#endregion

  type CatalogsUpdateHotelItem = {
    Attributes : CatalogsUpdatableHotelAttributes;
    HotelId : string;
    Operation : OperationEnum;
  }
  //#endregion
