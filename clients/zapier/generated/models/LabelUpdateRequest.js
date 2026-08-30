const utils = require('../utils/utils');
const LabelUpdateItem = require('../models/LabelUpdateItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                children: LabelUpdateItem.fields(`${keyPrefix}labels${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelUpdateItem),
        }
    },
}
