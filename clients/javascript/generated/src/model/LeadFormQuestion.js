/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import LeadFormQuestionFieldType from './LeadFormQuestionFieldType';
import LeadFormQuestionType from './LeadFormQuestionType';

/**
 * The LeadFormQuestion model module.
 * @module model/LeadFormQuestion
 * @version 1.1.1-pre.0
 */
class LeadFormQuestion {
    /**
     * Constructs a new <code>LeadFormQuestion</code>.
     * @alias module:model/LeadFormQuestion
     */
    constructor() { 
        
        LeadFormQuestion.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LeadFormQuestion</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LeadFormQuestion} obj Optional instance to populate.
     * @return {module:model/LeadFormQuestion} The populated <code>LeadFormQuestion</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LeadFormQuestion();

            if (data.hasOwnProperty('question_type')) {
                obj['question_type'] = LeadFormQuestionType.constructFromObject(data['question_type']);
            }
            if (data.hasOwnProperty('custom_question_field_type')) {
                obj['custom_question_field_type'] = LeadFormQuestionFieldType.constructFromObject(data['custom_question_field_type']);
            }
            if (data.hasOwnProperty('custom_question_label')) {
                obj['custom_question_label'] = ApiClient.convertToType(data['custom_question_label'], 'String');
            }
            if (data.hasOwnProperty('custom_question_options')) {
                obj['custom_question_options'] = ApiClient.convertToType(data['custom_question_options'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>LeadFormQuestion</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>LeadFormQuestion</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['custom_question_label'] && !(typeof data['custom_question_label'] === 'string' || data['custom_question_label'] instanceof String)) {
            throw new Error("Expected the field `custom_question_label` to be a primitive type in the JSON string but got " + data['custom_question_label']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['custom_question_options'])) {
            throw new Error("Expected the field `custom_question_options` to be an array in the JSON data but got " + data['custom_question_options']);
        }

        return true;
    }


}



/**
 * @member {module:model/LeadFormQuestionType} question_type
 */
LeadFormQuestion.prototype['question_type'] = undefined;

/**
 * @member {module:model/LeadFormQuestionFieldType} custom_question_field_type
 */
LeadFormQuestion.prototype['custom_question_field_type'] = undefined;

/**
 * Question label for a custom question.
 * @member {String} custom_question_label
 */
LeadFormQuestion.prototype['custom_question_label'] = undefined;

/**
 * Question options for a custom question.
 * @member {Array.<String>} custom_question_options
 */
LeadFormQuestion.prototype['custom_question_options'] = undefined;






export default LeadFormQuestion;
