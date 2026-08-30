const utils = require('../utils/utils');
const CustomerListRecordRow = require('../models/CustomerListRecordRow');
const UserListOperationType = require('../models/UserListOperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operation_type`,
                ...UserListOperationType.fields(`${keyPrefix}operation_type`, isInput),
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
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
            'records': bundle.inputData?.[`${keyPrefix}records`],
            'records_v2': utils.childMapping(bundle.inputData?.[`${keyPrefix}records_v2`], `${keyPrefix}records_v2`, CustomerListRecordRow),
        }
    },
}
