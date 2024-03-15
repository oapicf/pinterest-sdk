namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionEventsDataInnerCustomDataContentsInner
open OpenAPI.Model.string option

module ConversionEventsDataInnerCustomData =

  //#region ConversionEventsDataInnerCustomData


  type ConversionEvents_data_inner_custom_data = {
    Currency : string option;
    Value : string option;
    ContentIds : string[];
    ContentName : string option;
    ContentCategory : string option;
    ContentBrand : string option;
    Contents : ConversionEventsDataInnerCustomDataContentsInner[];
    NumItems : int64;
    OrderId : string option;
    SearchString : string option;
    OptOutType : string option;
    Np : string option;
  }
  //#endregion
