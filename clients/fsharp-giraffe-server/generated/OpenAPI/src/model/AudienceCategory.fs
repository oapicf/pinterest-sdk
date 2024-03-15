namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceSubcategory

module AudienceCategory =

  //#region AudienceCategory


  type AudienceCategory = {
    Key : string;
    Name : string;
    Ratio : decimal;
    Index : decimal;
    Id : string;
    Subcategories : AudienceSubcategory[];
  }
  //#endregion
