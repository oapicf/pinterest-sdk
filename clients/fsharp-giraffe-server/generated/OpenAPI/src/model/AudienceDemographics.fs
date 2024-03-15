namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceDemographicValue

module AudienceDemographics =

  //#region AudienceDemographics


  type AudienceDemographics = {
    Ages : AudienceDemographicValue[];
    Genders : AudienceDemographicValue[];
    Devices : AudienceDemographicValue[];
    Metros : AudienceDemographicValue[];
    Countries : AudienceDemographicValue[];
  }
  //#endregion
