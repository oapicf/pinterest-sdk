const utils = require('../utils/utils');
const UpdatableItemAttributes = require('../models/UpdatableItemAttributes');
const UpdateMaskFieldType = require('../models/UpdateMaskFieldType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
            ...UpdatableItemAttributes.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}update_mask`,
                list: true,
                type: 'string',
                ...UpdateMaskFieldType.fields(`${keyPrefix}update_mask`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'attributes': utils.removeIfEmpty(UpdatableItemAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'update_mask': utils.childMapping(bundle.inputData?.[`${keyPrefix}update_mask`], `${keyPrefix}update_mask`, UpdateMaskFieldType),
        }
    },
}
