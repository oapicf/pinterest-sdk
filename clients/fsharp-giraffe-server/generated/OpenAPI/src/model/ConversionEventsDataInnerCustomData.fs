namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventsDataInnerCustomDataContentsInner
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ConversionEventsDataInnerCustomData =

  //#region ConversionEventsDataInnerCustomData


  type ConversionEvents_data_inner_custom_data = {
    ContentBrand : string option;
    ContentCategory : string option;
    ContentIds : string[];
    ContentName : string option;
    Contents : ConversionEventsDataInnerCustomDataContentsInner[];
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
