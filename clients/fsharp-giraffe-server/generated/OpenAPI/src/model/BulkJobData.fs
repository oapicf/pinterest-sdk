namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkRequestStatus

module BulkJobData =

  //#region BulkJobData


  type BulkJobData = {
    ResultUrl : string;
    Status : BulkRequestStatus;
    WorkloadId : int;
  }
  //#endregion
