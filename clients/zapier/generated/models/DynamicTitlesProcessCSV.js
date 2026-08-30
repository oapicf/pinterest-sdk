const utils = require('../utils/utils');
const DynamicTitlesProcessCSVError = require('../models/DynamicTitlesProcessCSVError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: DynamicTitlesProcessCSVError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}status`,
                label: `Processing status. Present on success. - [${labelPrefix}status]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, DynamicTitlesProcessCSVError),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
