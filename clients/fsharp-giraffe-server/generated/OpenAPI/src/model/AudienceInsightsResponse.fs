namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceCategory
open OpenAPI.Model.AudienceDemographics
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.string option

module AudienceInsightsResponse =

  //#region AudienceInsightsResponse


  type AudienceInsightsResponse = {
    Categories : AudienceCategory[];
    Demographics : AudienceDemographics;
    Type : AudienceInsightType;
    Date : string option;
    Size : int;
    SizeIsUpperBound : bool;
  }
  //#endregion
