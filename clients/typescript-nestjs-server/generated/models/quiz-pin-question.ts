import { QuizPinOption } from './quiz-pin-option';


/**
 * A specific quiz inquiry.
 */
export interface QuizPinQuestion { 
  options?: Array<QuizPinOption>;
  question_id?: number;
  question_text?: string;
}

