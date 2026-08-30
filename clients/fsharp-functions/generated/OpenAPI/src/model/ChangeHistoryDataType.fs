namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChangeHistoryDataType =

  //#region ChangeHistoryDataType

  let STRINGEnum = "STRING"
  let NUMERICEnum = "NUMERIC"
  let MICROCURRENCYEnum = "MICROCURRENCY"
  let DATEEnum = "DATE"
  let BOOLEnum = "BOOL"
  let GENDERLISTEnum = "GENDER_LIST"
  let AGEBUCKETLISTEnum = "AGE_BUCKET_LIST"
  let APPTYPELISTEnum = "APPTYPE_LIST"
  let COUNTRYLISTEnum = "COUNTRY_LIST"
  let LOCALELISTEnum = "LOCALE_LIST"
  type ChangeHistoryDataType = string

  //#endregion
