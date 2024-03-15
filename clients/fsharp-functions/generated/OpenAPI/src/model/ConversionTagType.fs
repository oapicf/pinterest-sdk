namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ConversionTagType =

  //#region ConversionTagType

  let PAGELOADEnum = "PAGE_LOAD"
  let UNKNOWNEnum = "UNKNOWN"
  let INITIALIZEDEnum = "INITIALIZED"
  let PAGEVISITEnum = "PAGE_VISIT"
  let SIGNUPEnum = "SIGNUP"
  let CHECKOUTEnum = "CHECKOUT"
  let CUSTOMEnum = "CUSTOM"
  let VIEWCATEGORYEnum = "VIEW_CATEGORY"
  let SEARCHEnum = "SEARCH"
  let ADDTOCARTEnum = "ADD_TO_CART"
  let WATCHVIDEOEnum = "WATCH_VIDEO"
  let LEADEnum = "LEAD"
  let APPINSTALLEnum = "APP_INSTALL"
  let WEBSESSIONEnum = "WEB_SESSION"
  let EXTERNALMEASUREMENTEnum = "EXTERNAL_MEASUREMENT"
  type ConversionTagType = string

  //#endregion
