namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationLogClientError
open OpenAPI.Model.IntegrationLogClientRequest
open OpenAPI.Model.string option

module IntegrationLog =

  //#region IntegrationLog

  [<CLIMutable>]
  type IntegrationLog = {
    [<JsonProperty(PropertyName = "client_timestamp")>]
    ClientTimestamp : int;
    [<JsonProperty(PropertyName = "event_type")>]
    EventType : string;
    [<JsonProperty(PropertyName = "log_level")>]
    LogLevel : string;
    [<JsonProperty(PropertyName = "external_business_id")>]
    ExternalBusinessId : string option;
    [<JsonProperty(PropertyName = "advertiser_id")>]
    AdvertiserId : string option;
    [<JsonProperty(PropertyName = "merchant_id")>]
    MerchantId : string option;
    [<JsonProperty(PropertyName = "tag_id")>]
    TagId : string option;
    [<JsonProperty(PropertyName = "feed_profile_id")>]
    FeedProfileId : string option;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "app_version_number")>]
    AppVersionNumber : string;
    [<JsonProperty(PropertyName = "platform_version_number")>]
    PlatformVersionNumber : string;
    [<JsonProperty(PropertyName = "error")>]
    Error : IntegrationLogClientError;
    [<JsonProperty(PropertyName = "request")>]
    Request : IntegrationLogClientRequest;
  }

  //#endregion
