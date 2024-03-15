const utils = require('../utils/utils');
const SSIOAccountAddress = require('../models/SSIOAccountAddress');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Salesforce id for billto_info - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}io_terms_id`,
                label: `Salesforce id for IO Terms and Conditions - [${labelPrefix}io_terms_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}io_terms`,
                label: `Salesforce text for IO Terms and Conditions - [${labelPrefix}io_terms]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}us_terms_id`,
                label: `Salesforce id for US Terms and Conditions - [${labelPrefix}us_terms_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}us_terms`,
                label: `Salesforce text for US Terms and Conditions - [${labelPrefix}us_terms]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}row_terms_id`,
                label: `Salesforce id for Rest of the World Terms and Conditions - [${labelPrefix}row_terms_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}row_terms`,
                label: `Salesforce text for Rest of the World Terms and Conditions - [${labelPrefix}row_terms]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}io_type`,
                label: `Insertion Order Type - Pinterest Paper or Agency Paper - [${labelPrefix}io_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}addresses`,
                label: `[${labelPrefix}addresses]`,
                children: SSIOAccountAddress.fields(`${keyPrefix}addresses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'io_terms_id': bundle.inputData?.[`${keyPrefix}io_terms_id`],
            'io_terms': bundle.inputData?.[`${keyPrefix}io_terms`],
            'us_terms_id': bundle.inputData?.[`${keyPrefix}us_terms_id`],
            'us_terms': bundle.inputData?.[`${keyPrefix}us_terms`],
            'row_terms_id': bundle.inputData?.[`${keyPrefix}row_terms_id`],
            'row_terms': bundle.inputData?.[`${keyPrefix}row_terms`],
            'io_type': bundle.inputData?.[`${keyPrefix}io_type`],
            'addresses': utils.childMapping(bundle.inputData?.[`${keyPrefix}addresses`], `${keyPrefix}addresses`, SSIOAccountAddress),
        }
    },
}
