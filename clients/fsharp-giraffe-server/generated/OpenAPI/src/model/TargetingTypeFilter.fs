namespace OpenAPI.Model

open System
open System.Collections.Generic

module TargetingTypeFilter =

  //#region TargetingTypeFilter

  //#region enums
  type TargetingTypesEnum[] = KEYWORDEnum of string[]  |  APPTYPEEnum of string[]  |  GENDEREnum of string[]  |  LOCATIONEnum of string[]  |  PLACEMENTEnum of string[]  |  COUNTRYEnum of string[]  |  TARGETEDINTERESTEnum of string[]  |  PINNERINTERESTEnum of string[]  |  AUDIENCEINCLUDEEnum of string[]  |  GEOEnum of string[]  |  AGEBUCKETEnum of string[]  |  REGIONEnum of string[]  |  MEDIATYPEEnum of string[]  |  AGEBUCKETANDGENDEREnum of string[]  |  AUDIENCEMULTIPLIEREnum of string[]  |  CREATIVEENHANCEMENTSEnum of string[]  |  LOCALADSSTORECODEEnum of string[]  
  //#endregion

  type TargetingTypeFilter = {
    TargetingTypes : TargetingTypesEnum[];
  }
  //#endregion
