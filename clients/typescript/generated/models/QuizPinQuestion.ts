/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { QuizPinOption } from '../models/QuizPinOption';
import { HttpFile } from '../http/http';

/**
* A specific quiz inquiry.
*/
export class QuizPinQuestion {
    'questionId'?: number;
    'questionText'?: string;
    'options'?: Array<QuizPinOption>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "questionId",
            "baseName": "question_id",
            "type": "number",
            "format": ""
        },
        {
            "name": "questionText",
            "baseName": "question_text",
            "type": "string",
            "format": ""
        },
        {
            "name": "options",
            "baseName": "options",
            "type": "Array<QuizPinOption>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return QuizPinQuestion.attributeTypeMap;
    }

    public constructor() {
    }
}
