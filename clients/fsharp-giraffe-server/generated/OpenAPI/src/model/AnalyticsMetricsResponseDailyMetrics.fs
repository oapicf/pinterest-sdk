namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module AnalyticsMetricsResponseDailyMetrics =

  //#region AnalyticsMetricsResponseDailyMetrics

  //#region enums
  type DataStatusEnum = PROCESSINGEnum of string  |  READYEnum of string  |  ESTIMATEEnum of string  |  BEFOREBUSINESSCREATEDEnum of string  |  BEFOREDATARETENTIONPERIODEnum of string  |  BEFOREPINDATARETENTIONPERIODEnum of string  |  BEFOREMETRICSTARTDATEEnum of string  |  BEFORECOREMETRICSTARTDATEEnum of string  |  BEFOREPINFORMATMETRICSTARTDATEEnum of string  |  BEFOREAUDIENCEMETRICSTARTDATEEnum of string  |  BEFOREAUDIENCEMONTHLYMETRICSTARTDATEEnum of string  |  BEFOREVIDEOMETRICSTARTDATEEnum of string  |  BEFORECONVERSIONMETRICSTARTDATEEnum of string  |  PURCHASERSMETRICSMALLERTHANTHRESHOLDEnum of string  |  INBADTAGDATEEnum of string  |  BEFOREPUBLISHEDMETRICSTARTDATEEnum of string  |  BEFOREASSISTMETRICSTARTDATEEnum of string  |  BEFOREPINCREATEDEnum of string  |  BEFOREACCOUNTCLAIMEDEnum of string  |  BEFOREDEMOGRAPHICFILTERSSTARTDATEEnum of string  |  AUDIENCESEGMENTSMALLERTHANTHRESHOLDEnum of string  |  AUDIENCETOTALSMALLERTHANTHRESHOLDEnum of string  |  BEFOREPRODUCTGROUPFILTERSTARTDATEEnum of string  
  //#endregion

  type AnalyticsMetricsResponse_daily_metrics = {
    DataStatus : DataStatusEnum;
    Date : string;
    Metrics : IDictionary<string, decimal>;
  }
  //#endregion
