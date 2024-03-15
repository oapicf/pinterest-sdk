const utils = require('../utils/utils');
const ConversionTagType = require('../models/ConversionTagType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}conversion_event`,
                ...ConversionTagType.fields(`${keyPrefix}conversion_event`, isInput),
            },
            {
                key: `${keyPrefix}conversion_tag_id`,
                label: `Id of the tag. - [${labelPrefix}conversion_tag_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Id of the ad account. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Creation date in epoch format. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'conversion_event': bundle.inputData?.[`${keyPrefix}conversion_event`],
            'conversion_tag_id': bundle.inputData?.[`${keyPrefix}conversion_tag_id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
        }
    },
}
