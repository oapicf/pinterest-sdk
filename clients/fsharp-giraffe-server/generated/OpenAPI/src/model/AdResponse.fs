namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreativeType
open OpenAPI.Model.CustomizableCTAType
open OpenAPI.Model.DisclosureType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.QuizPinData
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdResponse =

  //#region AdResponse

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
    CreativeType : CreativeType;
    CustomizableCtaType : CustomizableCTAType;
    DestinationUrl : string option;
    DisclosureType : DisclosureType;
    DisclosureUrl : string option;
    GridClickType : GridClickType;
    IosDeepLink : string option;
    IsPinDeleted : bool;
    IsRemovable : bool;
    LeadFormId : string option;
    Name : string option;
    QuizPinData : QuizPinData;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    ViewTrackingUrl : string option;
    PinId : string;
    AdAccountId : string;
    CampaignId : string;
    CollectionItemsDestinationUrlTemplate : string option;
    CreatedTime : int;
    Id : string;
    RejectedReasons : RejectedReasonsEnum[];
    RejectionLabels : string[];
    ReviewStatus : ReviewStatusEnum;
    SummaryStatus : PinPromotionSummaryStatus;
    Type : string;
    UpdatedTime : int;
  }
  //#endregion
