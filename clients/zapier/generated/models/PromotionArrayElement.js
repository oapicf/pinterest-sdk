const utils = require('../utils/utils');
const Exception = require('../models/Exception');
const PromotionResponse = require('../models/PromotionResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PromotionResponse.fields(`${keyPrefix}data`, isInput),
            ...Exception.fields(`${keyPrefix}exception`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(PromotionResponse.mapping(bundle, `${keyPrefix}data`)),
            'exception': utils.removeIfEmpty(Exception.mapping(bundle, `${keyPrefix}exception`)),
        }
    },
}
