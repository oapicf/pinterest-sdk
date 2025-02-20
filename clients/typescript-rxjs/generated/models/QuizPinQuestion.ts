// tslint:disable
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

import type {
    QuizPinOption,
} from './';

/**
 * A specific quiz inquiry.
 * @export
 * @interface QuizPinQuestion
 */
export interface QuizPinQuestion {
    /**
     * @type {number}
     * @memberof QuizPinQuestion
     */
    question_id?: number;
    /**
     * @type {string}
     * @memberof QuizPinQuestion
     */
    question_text?: string;
    /**
     * @type {Array<QuizPinOption>}
     * @memberof QuizPinQuestion
     */
    options?: Array<QuizPinOption>;
}
