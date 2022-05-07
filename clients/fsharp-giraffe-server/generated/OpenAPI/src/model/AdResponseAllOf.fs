namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdResponseAllOf =

  //#region AdResponseAllOf

  //#region enums
  type CreativeTypeEnum = REGULAREnum of string  |  VIDEOEnum of string  |  SHOPPINGEnum of string  |  CAROUSELEnum of string  |  MAXVIDEOEnum of string  |  SHOPTHEPINEnum of string  |  STORYEnum of string  
  //#endregion

  type AdResponse_allOf = {
    AdGroupId : string;
    AndroidDeepLink : string option;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    ClickTrackingUrl : string option;
    CreativeType : CreativeTypeEnum;
    DestinationUrl : string option;
    IosDeepLink : string option;
    IsPinDeleted : bool;
    IsRemovable : bool;
    Name : string option;
    PinId : string;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    ViewTrackingUrl : string option;
  }
  //#endregion
