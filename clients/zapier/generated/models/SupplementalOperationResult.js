const utils = require('../utils/utils');
const SupplementalItemProcessingStatus = require('../models/SupplementalItemProcessingStatus');
const SupplementalItemValidationEvent = require('../models/SupplementalItemValidationEvent');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: SupplementalItemValidationEvent.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}item_id`,
                label: `Catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...SupplementalItemProcessingStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}store_code`,
                label: `Store code for the local inventory item - [${labelPrefix}store_code]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}supplemental_type`,
                label: `[${labelPrefix}supplemental_type]`,
                required: true,
                type: 'string',
                choices: [
                    'LOCAL_INVENTORY',
                ],
            },
            {
                key: `${keyPrefix}warnings`,
                label: `[${labelPrefix}warnings]`,
                children: SupplementalItemValidationEvent.fields(`${keyPrefix}warnings${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, SupplementalItemValidationEvent),
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'store_code': bundle.inputData?.[`${keyPrefix}store_code`],
            'supplemental_type': bundle.inputData?.[`${keyPrefix}supplemental_type`],
            'warnings': utils.childMapping(bundle.inputData?.[`${keyPrefix}warnings`], `${keyPrefix}warnings`, SupplementalItemValidationEvent),
        }
    },
}
