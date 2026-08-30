namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreativeType
open OpenAPI.Model.CustomizableCTAType
open OpenAPI.Model.DisclosureType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.string option

module AdCreateRequest =

  //#region AdCreateRequest


  type AdCreateRequest = {
    AdGroupId : string;
    AndroidDeepLink : string option;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    ClickTrackingUrl : string option;
    CreativeType : CreativeType;
    CustomizableCtaType : CustomizableCTAType;
    DestinationUrl : string option;
    DisclosureType : DisclosureType;
    DisclosureUrl : string option;
    GridClickType : GridClickType;
    IosDeepLink : string option;
    IsCarting : bool;
    IsPinDeleted : bool;
    IsRemovable : bool;
    LeadFormId : string option;
    Name : string option;
    PinId : string;
    QuizPinData : obj;
    Status : EntityStatus;
    TrackingUrls : obj;
    ViewTrackingUrl : string option;
  }
  //#endregion
