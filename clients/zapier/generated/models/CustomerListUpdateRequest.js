const utils = require('../utils/utils');
const Exception = require('../models/Exception');
const UserListOperationType = require('../models/UserListOperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}records`,
                label: `Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. - [${labelPrefix}records]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation_type`,
                ...UserListOperationType.fields(`${keyPrefix}operation_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'records': bundle.inputData?.[`${keyPrefix}records`],
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
            'exceptions': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
