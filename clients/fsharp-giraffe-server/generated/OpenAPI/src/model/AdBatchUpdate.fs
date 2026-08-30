namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCollectionsHeaderType
open OpenAPI.Model.CreativeType
open OpenAPI.Model.CustomizableCTAType
open OpenAPI.Model.DisclosureType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.QuizPinData
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdBatchUpdate =

  //#region AdBatchUpdate


  type AdBatchUpdate = {
    AdGroupId : string;
    AndroidDeepLink : string option;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    ClickTrackingUrl : string option;
    CollectionItemsDestinationUrlTemplate : string option;
    CollectionsHeaderType : AdCollectionsHeaderType;
    CreativeType : CreativeType;
    CustomizableCtaType : CustomizableCTAType;
    DestinationUrl : string option;
    DisclosureType : DisclosureType;
    DisclosureUrl : string option;
    GridClickType : GridClickType;
    Id : string;
    IosDeepLink : string option;
    IsCarting : bool;
    IsCollageAcceptedTerms : bool;
    IsCollageSingleDestination : bool;
    IsPinDeleted : bool;
    IsRemovable : bool;
    LeadFormId : string option;
    Name : string option;
    PinId : string;
    QuizPinData : QuizPinData;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    ViewTrackingUrl : string option;
  }
  //#endregion
