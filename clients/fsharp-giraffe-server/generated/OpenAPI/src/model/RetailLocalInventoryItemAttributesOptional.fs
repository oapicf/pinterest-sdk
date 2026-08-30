namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAvailability

module RetailLocalInventoryItemAttributesOptional =

  //#region RetailLocalInventoryItemAttributesOptional


  type RetailLocalInventoryItemAttributesOptional = {
    AdLink : string;
    Availability : ItemAvailability;
    Price : string;
    SalePrice : string;
  }
  //#endregion
