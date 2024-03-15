namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventsDataInnerCustomDataContentsInner
open OpenAPI.Model.string option

module ConversionEventsDataInnerCustomData =

  //#region ConversionEventsDataInnerCustomData

  [<CLIMutable>]
  type ConversionEventsDataInnerCustomData = {
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string option;
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
    [<JsonProperty(PropertyName = "content_ids")>]
    ContentIds : string[];
    [<JsonProperty(PropertyName = "content_name")>]
    ContentName : string option;
    [<JsonProperty(PropertyName = "content_category")>]
    ContentCategory : string option;
    [<JsonProperty(PropertyName = "content_brand")>]
    ContentBrand : string option;
    [<JsonProperty(PropertyName = "contents")>]
    Contents : ConversionEventsDataInnerCustomDataContentsInner[];
    [<JsonProperty(PropertyName = "num_items")>]
    NumItems : int64;
    [<JsonProperty(PropertyName = "order_id")>]
    OrderId : string option;
    [<JsonProperty(PropertyName = "search_string")>]
    SearchString : string option;
    [<JsonProperty(PropertyName = "opt_out_type")>]
    OptOutType : string option;
    [<JsonProperty(PropertyName = "np")>]
    Np : string option;
  }

  //#endregion
