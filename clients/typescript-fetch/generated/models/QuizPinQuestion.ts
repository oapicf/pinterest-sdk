/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { QuizPinOption } from './QuizPinOption';
import {
    QuizPinOptionFromJSON,
    QuizPinOptionFromJSONTyped,
    QuizPinOptionToJSON,
    QuizPinOptionToJSONTyped,
} from './QuizPinOption';

/**
 * A specific quiz inquiry.
 * @export
 * @interface QuizPinQuestion
 */
export interface QuizPinQuestion {
    /**
     * 
     * @type {number}
     * @memberof QuizPinQuestion
     */
    questionId?: number;
    /**
     * 
     * @type {string}
     * @memberof QuizPinQuestion
     */
    questionText?: string;
    /**
     * 
     * @type {Array<QuizPinOption>}
     * @memberof QuizPinQuestion
     */
    options?: Array<QuizPinOption>;
}

/**
 * Check if a given object implements the QuizPinQuestion interface.
 */
export function instanceOfQuizPinQuestion(value: object): value is QuizPinQuestion {
    return true;
}

export function QuizPinQuestionFromJSON(json: any): QuizPinQuestion {
    return QuizPinQuestionFromJSONTyped(json, false);
}

export function QuizPinQuestionFromJSONTyped(json: any, ignoreDiscriminator: boolean): QuizPinQuestion {
    if (json == null) {
        return json;
    }
    return {
        
        'questionId': json['question_id'] == null ? undefined : json['question_id'],
        'questionText': json['question_text'] == null ? undefined : json['question_text'],
        'options': json['options'] == null ? undefined : ((json['options'] as Array<any>).map(QuizPinOptionFromJSON)),
    };
}

  export function QuizPinQuestionToJSON(json: any): QuizPinQuestion {
      return QuizPinQuestionToJSONTyped(json, false);
  }

  export function QuizPinQuestionToJSONTyped(value?: QuizPinQuestion | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'question_id': value['questionId'],
        'question_text': value['questionText'],
        'options': value['options'] == null ? undefined : ((value['options'] as Array<any>).map(QuizPinOptionToJSON)),
    };
}

