namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionEventsDataItemsCustomDataContentsItems =

  //#region ConversionEventsDataItemsCustomDataContentsItems

  [<CLIMutable>]
  type ConversionEventsDataItemsCustomDataContentsItems = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "item_brand")>]
    ItemBrand : string;
    [<JsonProperty(PropertyName = "item_brand_id")>]
    ItemBrandId : string;
    [<JsonProperty(PropertyName = "item_category")>]
    ItemCategory : string;
    [<JsonProperty(PropertyName = "item_name")>]
    ItemName : string;
    [<JsonProperty(PropertyName = "item_price")>]
    ItemPrice : string;
    [<JsonProperty(PropertyName = "quantity")>]
    Quantity : int64;
  }

  //#endregion
