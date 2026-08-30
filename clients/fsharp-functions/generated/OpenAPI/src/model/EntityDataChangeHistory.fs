namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChangeHistoryDataType

module EntityDataChangeHistory =

  //#region EntityDataChangeHistory

  [<CLIMutable>]
  type EntityDataChangeHistory = {
    [<JsonProperty(PropertyName = "changed_field_id")>]
    ChangedFieldId : string;
    [<JsonProperty(PropertyName = "changed_field_name")>]
    ChangedFieldName : string;
    [<JsonProperty(PropertyName = "data_type")>]
    DataType : ChangeHistoryDataType;
    [<JsonProperty(PropertyName = "new_data_value")>]
    NewDataValue : string;
    [<JsonProperty(PropertyName = "old_data_value")>]
    OldDataValue : string;
  }

  //#endregion
