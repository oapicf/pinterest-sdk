namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module IntegrationLogClientRequest =

  //#region IntegrationLogClientRequest

  //#region enums
  type MethodEnum = GETEnum of string  |  HEADEnum of string  |  POSTEnum of string  |  PUTEnum of string  |  DELETEEnum of string  |  CONNECTEnum of string  |  OPTIONSEnum of string  |  TRACEEnum of string  |  PATCHEnum of string  
  //#endregion

  type IntegrationLogClientRequest = {
    Method : MethodEnum;
    Host : string;
    Path : string;
    RequestHeaders : IDictionary<string, string>;
    ResponseHeaders : IDictionary<string, string>;
    ResponseStatusCode : int;
  }
  //#endregion
