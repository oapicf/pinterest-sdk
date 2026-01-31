const utils = require('../utils/utils');
const S3FilePart = require('../models/S3FilePart');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_parts`,
                label: `[${labelPrefix}file_parts]`,
                children: S3FilePart.fields(`${keyPrefix}file_parts${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_parts': utils.childMapping(bundle.inputData?.[`${keyPrefix}file_parts`], `${keyPrefix}file_parts`, S3FilePart),
        }
    },
}
