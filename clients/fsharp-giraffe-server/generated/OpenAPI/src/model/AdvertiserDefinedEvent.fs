namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module AdvertiserDefinedEvent =

  //#region AdvertiserDefinedEvent

  //#region enums
  type MappedConversionTypeEnum = PAGELOADEnum of string option  |  UNKNOWNEnum of string option  |  INITIALIZEDEnum of string option  |  PAGEVISITEnum of string option  |  SIGNUPEnum of string option  |  CHECKOUTEnum of string option  |  CUSTOMEnum of string option  |  VIEWCATEGORYEnum of string option  |  SEARCHEnum of string option  |  ADDTOCARTEnum of string option  |  WATCHVIDEOEnum of string option  |  LEADEnum of string option  |  APPINSTALLEnum of string option  |  WEBSESSIONEnum of string option  |  EXTERNALMEASUREMENTEnum of string option  |  ADDPAYMENTINFOEnum of string option  |  ADDTOWISHLISTEnum of string option  |  INITIATECHECKOUTEnum of string option  |  SUBSCRIBEEnum of string option  |  VIEWCONTENTEnum of string option  |  ADVERTISERDEFINEDEVENTEnum of string option  |  APPOPENEnum of string option  |  CONTACTEnum of string option  |  SCHEDULEEnum of string option  |  FINDLOCATIONEnum of string option  |  CUSTOMIZEPRODUCTEnum of string option  |  SUBMITAPPLICATIONEnum of string option  |  STARTTRIALEnum of string option  
  //#endregion

  type AdvertiserDefinedEvent = {
    Name : string;
    MappedConversionType : MappedConversionTypeEnum;
  }
  //#endregion
