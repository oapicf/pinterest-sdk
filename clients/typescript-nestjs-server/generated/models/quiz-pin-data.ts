import { QuizPinResult } from './quiz-pin-result';
import { QuizPinQuestion } from './quiz-pin-question';
import { TieBreakerType } from './tie-breaker-type';


/**
 * This field includes all quiz data including questions, options, and results.
 */
export interface QuizPinData { 
  questions?: Array<QuizPinQuestion>;
  results?: Array<QuizPinResult>;
  tie_breaker_custom_result?: QuizPinResult | null;
  tie_breaker_type?: TieBreakerType;
}
export namespace QuizPinData {
}


