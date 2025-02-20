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

/**
 * Lead form question field type
 * @export
 * @enum {string}
 */
export enum LeadFormQuestionFieldType {
    TextField = 'TEXT_FIELD',
    TextArea = 'TEXT_AREA',
    RadioList = 'RADIO_LIST',
    Checkbox = 'CHECKBOX'
}

export function LeadFormQuestionFieldTypeFromJSON(json: any): LeadFormQuestionFieldType {
    return json as LeadFormQuestionFieldType;
}

export function LeadFormQuestionFieldTypeToJSON(value?: LeadFormQuestionFieldType): any {
    return value as any;
}

