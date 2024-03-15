namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes

module CatalogsUpsertHotelItem =

  //#region CatalogsUpsertHotelItem

  //#region enums
  type OperationEnum = UPSERTEnum of string  
  //#endregion

  type CatalogsUpsertHotelItem = {
    HotelId : string;
    Operation : OperationEnum;
    Attributes : CatalogsHotelAttributes;
  }
  //#endregion
