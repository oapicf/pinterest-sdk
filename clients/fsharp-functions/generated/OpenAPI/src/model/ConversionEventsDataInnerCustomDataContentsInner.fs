namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionEventsDataInnerCustomDataContentsInner =

  //#region ConversionEventsDataInnerCustomDataContentsInner

  [<CLIMutable>]
  type ConversionEventsDataInnerCustomDataContentsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "item_price")>]
    ItemPrice : string;
    [<JsonProperty(PropertyName = "quantity")>]
    Quantity : int64;
    [<JsonProperty(PropertyName = "item_name")>]
    ItemName : string;
    [<JsonProperty(PropertyName = "item_category")>]
    ItemCategory : string;
    [<JsonProperty(PropertyName = "item_brand")>]
    ItemBrand : string;
  }

  //#endregion
