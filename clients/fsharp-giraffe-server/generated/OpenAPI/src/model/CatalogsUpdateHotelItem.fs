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
    HotelId : string;
    Operation : OperationEnum;
    Attributes : CatalogsUpdatableHotelAttributes;
  }
  //#endregion
