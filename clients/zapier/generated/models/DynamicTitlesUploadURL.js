const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}existing_filename`,
                label: `If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. - [${labelPrefix}existing_filename]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}request_id`,
                label: `Unique identifier for this upload session. Must be passed to the process endpoint. - [${labelPrefix}request_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}upload_url`,
                label: `Pre-signed S3 PUT URL to upload the reviewed CSV file. - [${labelPrefix}upload_url]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'existing_filename': bundle.inputData?.[`${keyPrefix}existing_filename`],
            'request_id': bundle.inputData?.[`${keyPrefix}request_id`],
            'upload_url': bundle.inputData?.[`${keyPrefix}upload_url`],
        }
    },
}
