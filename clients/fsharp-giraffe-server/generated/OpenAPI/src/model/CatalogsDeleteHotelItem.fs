namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsDeleteHotelItem =

  //#region CatalogsDeleteHotelItem

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsDeleteHotelItem = {
    HotelId : string;
    Operation : OperationEnum;
  }
  //#endregion
