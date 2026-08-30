import { LeadFormQuestionType } from './lead-form-question-type';
import { LeadFormQuestionFieldType } from './lead-form-question-field-type';


export interface LeadFormQuestion { 
  custom_question_field_type?: LeadFormQuestionFieldType | null;
  /**
   * Question label for a custom question.
   */
  custom_question_label?: string | null;
  /**
   * Question options for a custom question.
   */
  custom_question_options?: Array<string> | null;
  question_type?: LeadFormQuestionType;
}
export namespace LeadFormQuestion {
}


