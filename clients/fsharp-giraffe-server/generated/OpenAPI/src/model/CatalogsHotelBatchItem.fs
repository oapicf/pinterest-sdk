namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreateHotelItem
open OpenAPI.Model.CatalogsDeleteHotelItem
open OpenAPI.Model.CatalogsUpdatableHotelAttributes
open OpenAPI.Model.CatalogsUpdateHotelItem
open OpenAPI.Model.CatalogsUpsertHotelItem

module CatalogsHotelBatchItem =

  //#region CatalogsHotelBatchItem

  //#region enums
  type OperationEnum = DELETEEnum of string  
  //#endregion

  type CatalogsHotelBatchItem = {
    HotelId : string;
    Operation : OperationEnum;
    Attributes : CatalogsUpdatableHotelAttributes;
  }
  //#endregion
