const utils = require('../utils/utils');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...Pinterest.Lib.Error.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exceptions': utils.removeIfEmpty(Pinterest.Lib.Error.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
