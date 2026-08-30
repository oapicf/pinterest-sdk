namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdCollectionsHeaderType
open OpenAPI.Model.AdDisapprovalReasons
open OpenAPI.Model.AdReviewStatus
open OpenAPI.Model.CartingProduct
open OpenAPI.Model.CreativeType
open OpenAPI.Model.CustomizableCTAType
open OpenAPI.Model.DisclosureType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.QuizPinData
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module Ad =

  //#region Ad


  type Ad = {
    AdAccountId : string;
    AdGroupId : string;
    AndroidDeepLink : string option;
    CampaignId : string;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    CartingPlatformType : int;
    CartingProducts : CartingProduct[];
    ClickTrackingUrl : string option;
    CollectionItemsDestinationUrlTemplate : string option;
    CollectionsHeaderType : AdCollectionsHeaderType;
    CreatedTime : int;
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
    RejectedReasons : AdDisapprovalReasons[];
    RejectionLabels : string[];
    ReviewStatus : AdReviewStatus;
    Status : EntityStatus;
    SummaryStatus : PinPromotionSummaryStatus;
    TrackingUrls : TrackingUrls;
    Type : string;
    UpdatedTime : int;
    ViewTrackingUrl : string option;
  }
  //#endregion
