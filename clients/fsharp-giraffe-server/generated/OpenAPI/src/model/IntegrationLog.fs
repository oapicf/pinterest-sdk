namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IntegrationLogClientError
open OpenAPI.Model.IntegrationLogClientRequest
open OpenAPI.Model.string option

module IntegrationLog =

  //#region IntegrationLog

  //#region enums
  type EventTypeEnum = APPEnum of string  |  APIEnum of string  
  //#endregion
  //#region enums
  type LogLevelEnum = INFOEnum of string  |  WARNEnum of string  |  ERROREnum of string  
  //#endregion

  type IntegrationLog = {
    ClientTimestamp : int;
    EventType : EventTypeEnum;
    LogLevel : LogLevelEnum;
    ExternalBusinessId : string option;
    AdvertiserId : string option;
    MerchantId : string option;
    TagId : string option;
    FeedProfileId : string option;
    Message : string;
    AppVersionNumber : string;
    PlatformVersionNumber : string;
    Error : IntegrationLogClientError;
    Request : IntegrationLogClientRequest;
  }
  //#endregion
