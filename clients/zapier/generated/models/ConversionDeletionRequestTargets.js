const utils = require('../utils/utils');
const ConversionDeletionRequestEPIKTargets = require('../models/ConversionDeletionRequestEPIKTargets');
const ConversionDeletionRequestUserEmailTargets = require('../models/ConversionDeletionRequestUserEmailTargets');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}user_emails`,
                label: `Array of plain text user emails. - [${labelPrefix}user_emails]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}epiks`,
                label: `Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). - [${labelPrefix}epiks]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'user_emails': bundle.inputData?.[`${keyPrefix}user_emails`],
            'epiks': bundle.inputData?.[`${keyPrefix}epiks`],
        }
    },
}
