const utils = require('../utils/utils');
const LabelCreateRequest_labels_inner = require('../models/LabelCreateRequest_labels_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                children: LabelCreateRequest_labels_inner.fields(`${keyPrefix}labels${!isInput ? '[]' : ''}`, isInput, true), 
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
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelCreateRequest_labels_inner),
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
        }
    },
}
