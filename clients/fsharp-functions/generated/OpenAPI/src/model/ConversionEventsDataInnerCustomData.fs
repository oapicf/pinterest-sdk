namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventsDataInnerCustomDataContentsInner
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ConversionEventsDataInnerCustomData =

  //#region ConversionEventsDataInnerCustomData

  [<CLIMutable>]
  type ConversionEventsDataInnerCustomData = {
    [<JsonProperty(PropertyName = "content_brand")>]
    ContentBrand : string option;
    [<JsonProperty(PropertyName = "content_category")>]
    ContentCategory : string option;
    [<JsonProperty(PropertyName = "content_ids")>]
    ContentIds : string[];
    [<JsonProperty(PropertyName = "content_name")>]
    ContentName : string option;
    [<JsonProperty(PropertyName = "contents")>]
    Contents : ConversionEventsDataInnerCustomDataContentsInner[];
    [<JsonProperty(PropertyName = "currency")>]
    Currency : string option;
    [<JsonProperty(PropertyName = "external_measurement_id")>]
    ExternalMeasurementId : string option;
    [<JsonProperty(PropertyName = "external_measurement_vendor_id")>]
    ExternalMeasurementVendorId : int option;
    [<JsonProperty(PropertyName = "np")>]
    Np : string option;
    [<JsonProperty(PropertyName = "num_items")>]
    NumItems : int64;
    [<JsonProperty(PropertyName = "opt_out_type")>]
    OptOutType : string option;
    [<JsonProperty(PropertyName = "order_id")>]
    OrderId : string option;
    [<JsonProperty(PropertyName = "predicted_ltv")>]
    PredictedLtv : string option;
    [<JsonProperty(PropertyName = "search_string")>]
    SearchString : string option;
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
  }

  //#endregion
