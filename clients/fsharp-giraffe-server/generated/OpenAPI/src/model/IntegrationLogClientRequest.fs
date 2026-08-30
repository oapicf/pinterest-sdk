namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.HttpMethod
open System.Collections.Generic

module IntegrationLogClientRequest =

  //#region IntegrationLogClientRequest


  type IntegrationLogClientRequest = {
    Host : string;
    Method : HttpMethod;
    Path : string;
    RequestHeaders : IDictionary<string, string>;
    ResponseHeaders : IDictionary<string, string>;
    ResponseStatusCode : int;
  }
  //#endregion
