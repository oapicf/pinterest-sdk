namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAvailability
open OpenAPI.Model.StoreMetadata

module LocalInventoryItemResponse =

  //#region LocalInventoryItemResponse


  type LocalInventoryItemResponse = {
    AdLink : string;
    Availability : ItemAvailability;
    CreatedAt : int64;
    ItemId : string;
    LastUpdatedTime : int64;
    Price : string;
    SalePrice : string;
    StoreMetadata : StoreMetadata;
  }
  //#endregion
