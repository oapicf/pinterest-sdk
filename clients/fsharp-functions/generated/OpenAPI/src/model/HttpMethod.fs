namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module HttpMethod =

  //#region HttpMethod

  let GETEnum = "GET"
  let HEADEnum = "HEAD"
  let POSTEnum = "POST"
  let PUTEnum = "PUT"
  let DELETEEnum = "DELETE"
  let CONNECTEnum = "CONNECT"
  let OPTIONSEnum = "OPTIONS"
  let TRACEEnum = "TRACE"
  let PATCHEnum = "PATCH"
  type HttpMethod = string

  //#endregion
