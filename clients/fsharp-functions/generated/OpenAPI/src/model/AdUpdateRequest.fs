namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreativeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.QuizPinData
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdUpdateRequest =

  //#region AdUpdateRequest

  [<CLIMutable>]
  type AdUpdateRequest = {
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "android_deep_link")>]
    AndroidDeepLink : string option;
    [<JsonProperty(PropertyName = "carousel_android_deep_links")>]
    CarouselAndroidDeepLinks : string[];
    [<JsonProperty(PropertyName = "carousel_destination_urls")>]
    CarouselDestinationUrls : string[];
    [<JsonProperty(PropertyName = "carousel_ios_deep_links")>]
    CarouselIosDeepLinks : string[];
    [<JsonProperty(PropertyName = "click_tracking_url")>]
    ClickTrackingUrl : string option;
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : CreativeType;
    [<JsonProperty(PropertyName = "destination_url")>]
    DestinationUrl : string option;
    [<JsonProperty(PropertyName = "ios_deep_link")>]
    IosDeepLink : string option;
    [<JsonProperty(PropertyName = "is_pin_deleted")>]
    IsPinDeleted : bool;
    [<JsonProperty(PropertyName = "is_removable")>]
    IsRemovable : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
    [<JsonProperty(PropertyName = "view_tracking_url")>]
    ViewTrackingUrl : string option;
    [<JsonProperty(PropertyName = "lead_form_id")>]
    LeadFormId : string option;
    [<JsonProperty(PropertyName = "grid_click_type")>]
    GridClickType : GridClickType;
    [<JsonProperty(PropertyName = "customizable_cta_type")>]
    CustomizableCtaType : string option;
    [<JsonProperty(PropertyName = "quiz_pin_data")>]
    QuizPinData : QuizPinData;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string option;
  }

  //#endregion
