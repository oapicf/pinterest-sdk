namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAvailability

module RetailLocalInventoryItemAttributesOptional =

  //#region RetailLocalInventoryItemAttributesOptional

  [<CLIMutable>]
  type RetailLocalInventoryItemAttributesOptional = {
    [<JsonProperty(PropertyName = "ad_link")>]
    AdLink : string;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : ItemAvailability;
    [<JsonProperty(PropertyName = "price")>]
    Price : string;
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string;
  }

  //#endregion
