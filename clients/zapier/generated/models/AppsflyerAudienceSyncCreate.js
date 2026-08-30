const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}container_id`,
                label: `The container ID of the audience - [${labelPrefix}container_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}url_adid_sha256`,
                label: `The pre-signed URL for SHA256 hashed GAID/IDFA file - [${labelPrefix}url_adid_sha256]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url_email_sha256`,
                label: `The pre-signed URL for SHA256 hashed email file - [${labelPrefix}url_email_sha256]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'container_id': bundle.inputData?.[`${keyPrefix}container_id`],
            'url_adid_sha256': bundle.inputData?.[`${keyPrefix}url_adid_sha256`],
            'url_email_sha256': bundle.inputData?.[`${keyPrefix}url_email_sha256`],
        }
    },
}
