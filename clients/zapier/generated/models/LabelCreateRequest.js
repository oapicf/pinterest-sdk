const utils = require('../utils/utils');
const LabelCreateItem = require('../models/LabelCreateItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                children: LabelCreateItem.fields(`${keyPrefix}labels${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelCreateItem),
        }
    },
}
