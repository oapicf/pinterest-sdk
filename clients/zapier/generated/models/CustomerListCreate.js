const utils = require('../utils/utils');
const CustomerListRecordRow = require('../models/CustomerListRecordRow');
const UserListType = require('../models/UserListType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_nca`,
                label: `Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. - [${labelPrefix}is_nca]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}list_type`,
                ...UserListType.fields(`${keyPrefix}list_type`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Customer list name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}records`,
                label: `Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. - [${labelPrefix}records]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}records_v2`,
                label: `[${labelPrefix}records_v2]`,
                children: CustomerListRecordRow.fields(`${keyPrefix}records_v2${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_nca': bundle.inputData?.[`${keyPrefix}is_nca`],
            'list_type': bundle.inputData?.[`${keyPrefix}list_type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'records': bundle.inputData?.[`${keyPrefix}records`],
            'records_v2': utils.childMapping(bundle.inputData?.[`${keyPrefix}records_v2`], `${keyPrefix}records_v2`, CustomerListRecordRow),
        }
    },
}
