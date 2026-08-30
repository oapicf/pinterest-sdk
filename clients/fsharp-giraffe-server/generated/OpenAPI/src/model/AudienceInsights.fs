namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceCategory
open OpenAPI.Model.AudienceDemographics
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.string option

module AudienceInsights =

  //#region AudienceInsights


  type AudienceInsights = {
    Categories : AudienceCategory[];
    Date : string option;
    Demographics : AudienceDemographics;
    Size : int;
    SizeIsUpperBound : bool;
    Type : AudienceInsightType;
  }
  //#endregion
