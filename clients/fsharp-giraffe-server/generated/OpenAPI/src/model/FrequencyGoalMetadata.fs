namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FrequencyGoalMetadataTimerange

module FrequencyGoalMetadata =

  //#region FrequencyGoalMetadata


  type FrequencyGoalMetadata = {
    Frequency : int;
    Timerange : FrequencyGoalMetadataTimerange;
  }
  //#endregion
