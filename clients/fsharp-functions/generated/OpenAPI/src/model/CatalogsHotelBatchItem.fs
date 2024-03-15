namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreateHotelItem
open OpenAPI.Model.CatalogsDeleteHotelItem
open OpenAPI.Model.CatalogsUpdatableHotelAttributes
open OpenAPI.Model.CatalogsUpdateHotelItem
open OpenAPI.Model.CatalogsUpsertHotelItem

module CatalogsHotelBatchItem =

  //#region CatalogsHotelBatchItem

  [<CLIMutable>]
  type CatalogsHotelBatchItem = {
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsUpdatableHotelAttributes;
  }

  //#endregion
