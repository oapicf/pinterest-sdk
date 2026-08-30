const utils = require('../utils/utils');
const OrderLine = require('../models/OrderLine');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderLine.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}error_messages`,
                label: `Error messages. - [${labelPrefix}error_messages]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(OrderLine.mapping(bundle, `${keyPrefix}data`)),
            'error_messages': bundle.inputData?.[`${keyPrefix}error_messages`],
        }
    },
}
