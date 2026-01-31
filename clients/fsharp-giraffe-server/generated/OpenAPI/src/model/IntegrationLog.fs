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
    AdvertiserId : string option;
    AppVersionNumber : string;
    ClientTimestamp : int;
    Error : IntegrationLogClientError;
    EventType : EventTypeEnum;
    ExternalBusinessId : string option;
    FeedProfileId : string option;
    LogLevel : LogLevelEnum;
    MerchantId : string option;
    Message : string;
    PlatformVersionNumber : string;
    Request : IntegrationLogClientRequest;
    TagId : string option;
  }
  //#endregion
