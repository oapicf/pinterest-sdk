namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdResponseAllOf
open OpenAPI.Model.AdResponseAllOf1
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdResponse =

  //#region AdResponse

  //#region enums
  type CreativeTypeEnum = REGULAREnum of string  |  VIDEOEnum of string  |  SHOPPINGEnum of string  |  CAROUSELEnum of string  |  MAXVIDEOEnum of string  |  SHOPTHEPINEnum of string  |  STORYEnum of string  
  //#endregion
  //#region enums
  type RejectedReasonsEnum[] = HASHTAGSEnum of string[]  |  PROMOTIONSANDPRICESEnum of string[]  |  TARGETINGEnum of string[]  |  LANDINGPAGEEnum of string[]  |  CAPSANDSYMBOLSEnum of string[]  |  SHOCKINGEnum of string[]  |  WEIGHTLOSSEnum of string[]  |  PROHIBITEDPRODUCTEnum of string[]  |  AUTHENTICITYEnum of string[]  |  NUDITYEnum of string[]  |  CONFUSINGDESIGNEnum of string[]  |  URGENCYEnum of string[]  |  RATINGSEnum of string[]  |  APPEnum of string[]  |  ALCOHOLEnum of string[]  |  CONTESTSEnum of string[]  |  POLITICALEnum of string[]  |  OTHEREnum of string[]  |  IMAGEEnum of string[]  |  NAREnum of string[]  |  INCONSISTENTEnum of string[]  |  CLICKBAITEnum of string[]  |  NODESCRIPTIONEnum of string[]  |  LOWQUALITYEnum of string[]  |  EXAGGERATEDCLAIMSEnum of string[]  |  PINTERESTBRANDEnum of string[]  |  ALCOHOLNOSALEEnum of string[]  |  LANDINGPAGESPEEDEnum of string[]  |  LANDINGPAGEHARDWALLEnum of string[]  |  LANDINGPAGEBROKENEnum of string[]  |  LANDINGPAGEQUALITYEnum of string[]  |  OUTOFSTOCKEnum of string[]  |  IMAGELOWQUALITYEnum of string[]  |  IMAGEBUSYEnum of string[]  |  IMAGEPOORLYEDITEDEnum of string[]  |  IMAGEBEFOREAFTEREnum of string[]  |  UGCEnum of string[]  |  FAKEBUTTONSEnum of string[]  |  WEAPONSEnum of string[]  |  SENSITIVEEnum of string[]  |  UNACCEPTABLEBUSINESSEnum of string[]  |  SUSPICIOUSCLAIMSEnum of string[]  |  PHARMAEnum of string[]  |  SUSPICIOUSSUPPLEMENTSEnum of string[]  |  ILLEGALRECREATIONALDRUGEnum of string[]  |  LOWQUALITYLANDINGPAGEEnum of string[]  |  RESTRICTEDHEALTHCAREEnum of string[]  |  INCONSISTENTLANGFREnum of string[]  
  //#endregion
  //#region enums
  type ReviewStatusEnum = OTHEREnum of string  |  PENDINGEnum of string  |  REJECTEDEnum of string  |  APPROVEDEnum of string  
  //#endregion

  type AdResponse = {
    AdGroupId : string;
    AndroidDeepLink : string option;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    ClickTrackingUrl : string option;
    CreativeType : CreativeTypeEnum;
    DestinationUrl : string option;
    IosDeepLink : string option;
    IsPinDeleted : bool;
    IsRemovable : bool;
    Name : string option;
    PinId : string;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    ViewTrackingUrl : string option;
    AdAccountId : string;
    CampaignId : string;
    CollectionItemsDestinationUrlTemplate : string option;
    CreatedTime : int;
    Id : string;
    RejectedReasons : RejectedReasonsEnum[];
    RejectionLabels : string[];
    ReviewStatus : ReviewStatusEnum;
    Type : string;
    UpdatedTime : int;
    SummaryStatus : PinPromotionSummaryStatus;
  }
  //#endregion
