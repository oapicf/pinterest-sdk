// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    QuizPinOption,
    QuizPinOptionFromJSON,
    QuizPinOptionToJSON,
} from './';

/**
 * A specific quiz inquiry.
 * @export
 * @interface QuizPinQuestion
 */
export interface QuizPinQuestion  {
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

export function QuizPinQuestionFromJSON(json: any): QuizPinQuestion {
    return {
        'questionId': !exists(json, 'question_id') ? undefined : json['question_id'],
        'questionText': !exists(json, 'question_text') ? undefined : json['question_text'],
        'options': !exists(json, 'options') ? undefined : (json['options'] as Array<any>).map(QuizPinOptionFromJSON),
    };
}

export function QuizPinQuestionToJSON(value?: QuizPinQuestion): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'question_id': value.questionId,
        'question_text': value.questionText,
        'options': value.options === undefined ? undefined : (value.options as Array<any>).map(QuizPinOptionToJSON),
    };
}

