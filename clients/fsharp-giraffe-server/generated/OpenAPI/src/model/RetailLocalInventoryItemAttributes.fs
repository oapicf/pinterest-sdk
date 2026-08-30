namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAvailability

module RetailLocalInventoryItemAttributes =

  //#region RetailLocalInventoryItemAttributes


  type RetailLocalInventoryItemAttributes = {
    AdLink : string;
    Availability : ItemAvailability;
    Price : string;
    SalePrice : string;
  }
  //#endregion
