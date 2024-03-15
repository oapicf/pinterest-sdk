namespace OpenAPI.Model

open System
open System.Collections.Generic

module OptimizationGoalMetadataFrequencyGoalMetadata =

  //#region OptimizationGoalMetadataFrequencyGoalMetadata

  //#region enums
  type TimerangeEnum = THIRTYDAYEnum of string  |  DAYEnum of string  |  SEVENDAYEnum of string  |  TWENTYMINUTEEnum of string  |  TENMINUTEEnum of string  |  TWENTYFOURHOUREnum of string  
  //#endregion

  type OptimizationGoalMetadata_frequency_goal_metadata = {
    Frequency : int;
    Timerange : TimerangeEnum;
  }
  //#endregion
