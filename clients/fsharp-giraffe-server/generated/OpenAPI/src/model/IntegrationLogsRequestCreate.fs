namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IntegrationLog

module IntegrationLogsRequestCreate =

  //#region IntegrationLogsRequestCreate


  type IntegrationLogsRequestCreate = {
    Logs : IntegrationLog[];
  }
  //#endregion
