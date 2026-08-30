namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IntegrationLogClientError
open OpenAPI.Model.IntegrationLogClientRequest
open OpenAPI.Model.IntegrationLogEventType
open OpenAPI.Model.IntegrationLogLevel
open OpenAPI.Model.string option

module IntegrationLog =

  //#region IntegrationLog


  type IntegrationLog = {
    AdvertiserId : string option;
    AppVersionNumber : string;
    ClientTimestamp : int;
    Error : IntegrationLogClientError;
    EventType : IntegrationLogEventType;
    ExternalBusinessId : string option;
    FeedProfileId : string option;
    LogLevel : IntegrationLogLevel;
    MerchantId : string option;
    Message : string;
    PlatformVersionNumber : string;
    Request : IntegrationLogClientRequest;
    TagId : string option;
  }
  //#endregion
