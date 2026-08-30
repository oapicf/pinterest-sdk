namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventsDataItemsCustomDataContentsItems
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ConversionEventsDataItemsCustomData =

  //#region ConversionEventsDataItemsCustomData


  type ConversionEventsDataItemsCustomData = {
    ContentBrand : string option;
    ContentCategory : string option;
    ContentIds : string[];
    ContentName : string option;
    Contents : ConversionEventsDataItemsCustomDataContentsItems[];
    Currency : string option;
    ExternalMeasurementId : string option;
    ExternalMeasurementVendorId : int option;
    Np : string option;
    NumItems : int64;
    OptOutType : string option;
    OrderId : string option;
    PredictedLtv : string option;
    SearchString : string option;
    Value : string option;
  }
  //#endregion
