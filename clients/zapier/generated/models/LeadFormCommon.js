const utils = require('../utils/utils');
const LeadFormQuestion = require('../models/LeadFormQuestion');
const LeadFormStatus = require('../models/LeadFormStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Internal name of the lead form. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}privacy_policy_link`,
                label: `A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. - [${labelPrefix}privacy_policy_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_accepted_terms`,
                label: `Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. - [${labelPrefix}has_accepted_terms]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}completion_message`,
                label: `A message for people who complete the form to let them know what happens next. - [${labelPrefix}completion_message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...LeadFormStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}disclosure_language`,
                label: `Additional disclosure language to be included in the lead form. - [${labelPrefix}disclosure_language]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}questions`,
                label: `[${labelPrefix}questions]`,
                children: LeadFormQuestion.fields(`${keyPrefix}questions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'privacy_policy_link': bundle.inputData?.[`${keyPrefix}privacy_policy_link`],
            'has_accepted_terms': bundle.inputData?.[`${keyPrefix}has_accepted_terms`],
            'completion_message': bundle.inputData?.[`${keyPrefix}completion_message`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'disclosure_language': bundle.inputData?.[`${keyPrefix}disclosure_language`],
            'questions': utils.childMapping(bundle.inputData?.[`${keyPrefix}questions`], `${keyPrefix}questions`, LeadFormQuestion),
        }
    },
}
