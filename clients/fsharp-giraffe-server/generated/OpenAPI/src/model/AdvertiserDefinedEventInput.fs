namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdvertiserDefinedEventMappingType

module AdvertiserDefinedEventInput =

  //#region AdvertiserDefinedEventInput


  type AdvertiserDefinedEventInput = {
    MappedConversionType : AdvertiserDefinedEventMappingType;
    Name : string;
  }
  //#endregion
