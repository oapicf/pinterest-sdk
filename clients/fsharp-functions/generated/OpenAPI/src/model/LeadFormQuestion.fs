namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadFormQuestionFieldType
open OpenAPI.Model.LeadFormQuestionType
open OpenAPI.Model.string option

module LeadFormQuestion =

  //#region LeadFormQuestion

  [<CLIMutable>]
  type LeadFormQuestion = {
    [<JsonProperty(PropertyName = "question_type")>]
    QuestionType : LeadFormQuestionType;
    [<JsonProperty(PropertyName = "custom_question_field_type")>]
    CustomQuestionFieldType : LeadFormQuestionFieldType;
    [<JsonProperty(PropertyName = "custom_question_label")>]
    CustomQuestionLabel : string option;
    [<JsonProperty(PropertyName = "custom_question_options")>]
    CustomQuestionOptions : string[];
  }

  //#endregion
