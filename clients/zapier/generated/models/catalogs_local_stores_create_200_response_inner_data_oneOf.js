const utils = require('../utils/utils');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the local store. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            ...Pinterest.Lib.Error.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'exceptions': utils.removeIfEmpty(Pinterest.Lib.Error.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
