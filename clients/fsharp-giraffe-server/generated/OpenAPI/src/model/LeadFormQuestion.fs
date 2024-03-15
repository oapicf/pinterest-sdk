namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormQuestionFieldType
open OpenAPI.Model.LeadFormQuestionType
open OpenAPI.Model.string option

module LeadFormQuestion =

  //#region LeadFormQuestion


  type LeadFormQuestion = {
    QuestionType : LeadFormQuestionType;
    CustomQuestionFieldType : LeadFormQuestionFieldType;
    CustomQuestionLabel : string option;
    CustomQuestionOptions : string[];
  }
  //#endregion
