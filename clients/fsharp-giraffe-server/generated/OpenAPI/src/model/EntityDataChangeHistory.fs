namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChangeHistoryDataType

module EntityDataChangeHistory =

  //#region EntityDataChangeHistory


  type EntityDataChangeHistory = {
    ChangedFieldId : string;
    ChangedFieldName : string;
    DataType : ChangeHistoryDataType;
    NewDataValue : string;
    OldDataValue : string;
  }
  //#endregion
