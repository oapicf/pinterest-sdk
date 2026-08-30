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
            {
                key: `${keyPrefix}parent_id`,
                label: `Unique identifier of the asset you are labelling. Currently, you can only label campaigns. - [${labelPrefix}parent_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelCreateItem),
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
        }
    },
}
