const utils = require('../utils/utils');
const EntityLabel = require('../models/EntityLabel');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...EntityLabel.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}error_messages`,
                label: `[${labelPrefix}error_messages]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(EntityLabel.mapping(bundle, `${keyPrefix}data`)),
            'error_messages': bundle.inputData?.[`${keyPrefix}error_messages`],
        }
    },
}
