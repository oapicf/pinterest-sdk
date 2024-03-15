const utils = require('../utils/utils');
const OrderLine = require('../models/OrderLine');
const OrderLineError = require('../models/OrderLineError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: .fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}order_line`,
                label: `[${labelPrefix}order_line]`,
                children: .fields(`${keyPrefix}order_line${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, OrderLineError),
            'order_line': utils.childMapping(bundle.inputData?.[`${keyPrefix}order_line`], `${keyPrefix}order_line`, OrderLine),
        }
    },
}
