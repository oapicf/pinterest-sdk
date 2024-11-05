const utils = require('../utils/utils');
const CatalogsFeedProcessingStatus = require('../models/CatalogsFeedProcessingStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}feed_id`,
                label: `[${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...CatalogsFeedProcessingStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
