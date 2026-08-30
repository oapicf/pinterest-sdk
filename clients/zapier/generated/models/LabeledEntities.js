const utils = require('../utils/utils');
const EntityLabel = require('../models/EntityLabel');
const EntityLabelError = require('../models/EntityLabelError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entities_labels`,
                label: `[${labelPrefix}entities_labels]`,
                children: EntityLabel.fields(`${keyPrefix}entities_labels${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: EntityLabelError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entities_labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}entities_labels`], `${keyPrefix}entities_labels`, EntityLabel),
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, EntityLabelError),
        }
    },
}
