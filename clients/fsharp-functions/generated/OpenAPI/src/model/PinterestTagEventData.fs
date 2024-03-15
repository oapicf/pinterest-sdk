namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Currency
open OpenAPI.Model.LineItem

module PinterestTagEventData =

  //#region PinterestTagEventData

  [<CLIMutable>]
  type PinterestTagEventData = {
    [<JsonProperty(PropertyName = "currency")>]
    Currency : Currency;
    [<JsonProperty(PropertyName = "lead_type")>]
    LeadType : string;
    [<JsonProperty(PropertyName = "line_items")>]
    LineItems : LineItem;
    [<JsonProperty(PropertyName = "order_id")>]
    OrderId : string;
    [<JsonProperty(PropertyName = "order_quantity")>]
    OrderQuantity : int;
    [<JsonProperty(PropertyName = "page_name")>]
    PageName : string;
    [<JsonProperty(PropertyName = "promo_code")>]
    PromoCode : string;
    [<JsonProperty(PropertyName = "property")>]
    Property : string;
    [<JsonProperty(PropertyName = "search_query")>]
    SearchQuery : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "video_title")>]
    VideoTitle : string;
  }

  //#endregion
