const utils = require('../utils/utils');
const LeadFormPolicyLink = require('../models/LeadFormPolicyLink');
const LeadFormQuestion = require('../models/LeadFormQuestion');
const LeadFormStatus = require('../models/LeadFormStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The Ad Account ID that this lead form belongs to. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}completion_message`,
                label: `A message for people who complete the form to let them know what happens next. - [${labelPrefix}completion_message]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Lead form creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}disclosure_language`,
                label: `Additional disclosure language to be included in the lead form. - [${labelPrefix}disclosure_language]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_accepted_terms`,
                label: `Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO - [${labelPrefix}has_accepted_terms]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of this lead form - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Internal name of the lead form. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}policy_links`,
                label: `[${labelPrefix}policy_links]`,
                children: LeadFormPolicyLink.fields(`${keyPrefix}policy_links${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}privacy_policy_link`,
                label: `A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. - [${labelPrefix}privacy_policy_link]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}questions`,
                label: `[${labelPrefix}questions]`,
                children: LeadFormQuestion.fields(`${keyPrefix}questions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}status`,
                ...LeadFormStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'completion_message': bundle.inputData?.[`${keyPrefix}completion_message`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'disclosure_language': bundle.inputData?.[`${keyPrefix}disclosure_language`],
            'has_accepted_terms': bundle.inputData?.[`${keyPrefix}has_accepted_terms`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'policy_links': utils.childMapping(bundle.inputData?.[`${keyPrefix}policy_links`], `${keyPrefix}policy_links`, LeadFormPolicyLink),
            'privacy_policy_link': bundle.inputData?.[`${keyPrefix}privacy_policy_link`],
            'questions': utils.childMapping(bundle.inputData?.[`${keyPrefix}questions`], `${keyPrefix}questions`, LeadFormQuestion),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
        }
    },
}
