namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdResponseAllOf =

  //#region AdResponseAllOf

  [<CLIMutable>]
  type AdResponseAllOf = {
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
    CreativeType : string;
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
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "tracking_urls")>]
    TrackingUrls : TrackingUrls;
    [<JsonProperty(PropertyName = "view_tracking_url")>]
    ViewTrackingUrl : string option;
  }

  //#endregion
