namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreativeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.QuizPinData
open OpenAPI.Model.TrackingUrls
open OpenAPI.Model.string option

module AdCommon =

  //#region AdCommon

  //#region enums
  type CustomizableCtaTypeEnum = GETOFFEREnum of string option  |  LEARNMOREEnum of string option  |  ORDERNOWEnum of string option  |  SHOPNOWEnum of string option  |  SIGNUPEnum of string option  |  SUBSCRIBEEnum of string option  |  BUYNOWEnum of string option  |  CONTACTUSEnum of string option  |  GETQUOTEEnum of string option  |  VISITSITEEnum of string option  |  APPLYNOWEnum of string option  |  BOOKNOWEnum of string option  |  REQUESTDEMOEnum of string option  |  REGISTERNOWEnum of string option  |  FINDADEALEREnum of string option  |  ADDTOCARTEnum of string option  |  WATCHNOWEnum of string option  |  READMOREEnum of string option  
  //#endregion

  type AdCommon = {
    AdGroupId : string;
    AndroidDeepLink : string option;
    CarouselAndroidDeepLinks : string[];
    CarouselDestinationUrls : string[];
    CarouselIosDeepLinks : string[];
    ClickTrackingUrl : string option;
    CreativeType : CreativeType;
    DestinationUrl : string option;
    IosDeepLink : string option;
    IsPinDeleted : bool;
    IsRemovable : bool;
    Name : string option;
    Status : EntityStatus;
    TrackingUrls : TrackingUrls;
    ViewTrackingUrl : string option;
    LeadFormId : string option;
    GridClickType : GridClickType;
    CustomizableCtaType : CustomizableCtaTypeEnum;
    QuizPinData : QuizPinData;
  }
  //#endregion
