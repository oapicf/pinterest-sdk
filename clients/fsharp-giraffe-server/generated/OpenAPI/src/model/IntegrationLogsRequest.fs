namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IntegrationLog

module IntegrationLogsRequest =

  //#region IntegrationLogsRequest


  type IntegrationLogsRequest = {
    Logs : IntegrationLog[];
  }
  //#endregion
