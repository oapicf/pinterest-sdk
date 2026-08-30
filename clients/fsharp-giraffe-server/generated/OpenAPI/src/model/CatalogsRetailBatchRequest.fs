namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsRetailBatchRequestItemsItems
open OpenAPI.Model.Country

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion
  //#region enums
  type LanguageEnum = AfZAEnum of string  |  ArSAEnum of string  |  BgBGEnum of string  |  BnINEnum of string  |  CsCZEnum of string  |  DaDKEnum of string  |  DeEnum of string  |  ElGREnum of string  |  EnAUEnum of string  |  EnCAEnum of string  |  EnGBEnum of string  |  EnINEnum of string  |  EnUSEnum of string  |  Es419Enum of string  |  EsAREnum of string  |  EsESEnum of string  |  EsMXEnum of string  |  FiFIEnum of string  |  FrEnum of string  |  FrCAEnum of string  |  HeILEnum of string  |  HiINEnum of string  |  HrHREnum of string  |  HuHUEnum of string  |  IdIDEnum of string  |  ItEnum of string  |  JaEnum of string  |  KoKREnum of string  |  MsMYEnum of string  |  NbNOEnum of string  |  NlEnum of string  |  PlPLEnum of string  |  PtBREnum of string  |  PtPTEnum of string  |  RoROEnum of string  |  RuRUEnum of string  |  SkSKEnum of string  |  SvSEEnum of string  |  TeINEnum of string  |  ThTHEnum of string  |  TlPHEnum of string  |  TrEnum of string  |  UkUAEnum of string  |  ViVNEnum of string  |  ZhCNEnum of string  |  ZhTWEnum of string  |  AMEnum of string  |  AREnum of string  |  AZEnum of string  |  BGEnum of string  |  BNEnum of string  |  BSEnum of string  |  CAEnum of string  |  CSEnum of string  |  DAEnum of string  |  DVEnum of string  |  DZEnum of string  |  DEEnum of string  |  ELEnum of string  |  ENEnum of string  |  ESEnum of string  |  ETEnum of string  |  FAEnum of string  |  FIEnum of string  |  FREnum of string  |  HEEnum of string  |  HIEnum of string  |  HREnum of string  |  HUEnum of string  |  HYEnum of string  |  IDEnum of string  |  INEnum of string  |  ISEnum of string  |  ITEnum of string  |  IWEnum of string  |  JAEnum of string  |  KAEnum of string  |  KMEnum of string  |  KOEnum of string  |  LOEnum of string  |  LTEnum of string  |  LVEnum of string  |  MKEnum of string  |  MNEnum of string  |  MSEnum of string  |  MYEnum of string  |  NBEnum of string  |  NEEnum of string  |  NLEnum of string  |  FalseEnum of string  |  PLEnum of string  |  PTEnum of string  |  ROEnum of string  |  RUEnum of string  |  SKEnum of string  |  SLEnum of string  |  SQEnum of string  |  SREnum of string  |  SVEnum of string  |  TLEnum of string  |  UKEnum of string  |  VIEnum of string  |  TEEnum of string  |  THEnum of string  |  TREnum of string  |  XXEnum of string  |  ZHEnum of string  
  //#endregion

  type CatalogsRetailBatchRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Items : CatalogsRetailBatchRequestItemsItems[];
    Language : LanguageEnum;
  }
  //#endregion
