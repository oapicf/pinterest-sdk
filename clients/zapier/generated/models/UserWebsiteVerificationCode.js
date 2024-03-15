const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}verification_code`,
                label: `Code to check against the user claiming the website - [${labelPrefix}verification_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dns_txt_record`,
                label: `DNS TXT record to check against for the website to be claimed - [${labelPrefix}dns_txt_record]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}metatag`,
                label: `Metatag the verification process searchs for the website to be claimed - [${labelPrefix}metatag]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}filename`,
                label: `File expected to find on the website being claimed - [${labelPrefix}filename]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}file_content`,
                label: `A full html file to upload to the website in order for it to be claimed - [${labelPrefix}file_content]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'verification_code': bundle.inputData?.[`${keyPrefix}verification_code`],
            'dns_txt_record': bundle.inputData?.[`${keyPrefix}dns_txt_record`],
            'metatag': bundle.inputData?.[`${keyPrefix}metatag`],
            'filename': bundle.inputData?.[`${keyPrefix}filename`],
            'file_content': bundle.inputData?.[`${keyPrefix}file_content`],
        }
    },
}
