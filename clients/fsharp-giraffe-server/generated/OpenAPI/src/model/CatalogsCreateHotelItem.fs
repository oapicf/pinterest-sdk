namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes

module CatalogsCreateHotelItem =

  //#region CatalogsCreateHotelItem

  //#region enums
  type OperationEnum = CREATEEnum of string  
  //#endregion

  type CatalogsCreateHotelItem = {
    HotelId : string;
    Operation : OperationEnum;
    Attributes : CatalogsHotelAttributes;
  }
  //#endregion
