const utils = require('../utils/utils');
const AdResponse = require('../models/AdResponse');
const Exception = require('../models/Exception');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AdResponse.fields(`${keyPrefix}data`, isInput),
            ...Exception.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(AdResponse.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.removeIfEmpty(Exception.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
