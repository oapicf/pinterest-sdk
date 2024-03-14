const utils = require('../utils/utils');
const UserListType = require('../models/UserListType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Customer list name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}records`,
                label: `Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. - [${labelPrefix}records]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}list_type`,
                ...UserListType.fields(`${keyPrefix}list_type`, isInput),
            },
            {
                key: `${keyPrefix}exceptions`,
                label: `Customer list errors. - [${labelPrefix}exceptions]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'records': bundle.inputData?.[`${keyPrefix}records`],
            'list_type': bundle.inputData?.[`${keyPrefix}list_type`],
            'exceptions': bundle.inputData?.[`${keyPrefix}exceptions`],
        }
    },
}
