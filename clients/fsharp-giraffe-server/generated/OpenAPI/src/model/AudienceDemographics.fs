namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceDemographicValue

module AudienceDemographics =

  //#region AudienceDemographics


  type AudienceDemographics = {
    Ages : AudienceDemographicValue[];
    Countries : AudienceDemographicValue[];
    Devices : AudienceDemographicValue[];
    Genders : AudienceDemographicValue[];
    Metros : AudienceDemographicValue[];
  }
  //#endregion
