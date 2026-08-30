const utils = require('../utils/utils');
const OrderLineMutationResult = require('../models/OrderLineMutationResult');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OrderLineMutationResult.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(OrderLineMutationResult.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
