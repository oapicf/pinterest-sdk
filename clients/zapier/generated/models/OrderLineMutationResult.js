const utils = require('../utils/utils');
const OrderLine = require('../models/OrderLine');
const OrderLineMutationError = require('../models/OrderLineMutationError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: OrderLineMutationError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}order_line`,
                label: `[${labelPrefix}order_line]`,
                children: OrderLine.fields(`${keyPrefix}order_line${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, OrderLineMutationError),
            'order_line': utils.childMapping(bundle.inputData?.[`${keyPrefix}order_line`], `${keyPrefix}order_line`, OrderLine),
        }
    },
}
