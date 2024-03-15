const utils = require('../utils/utils');
const ItemProcessingStatus = require('../models/ItemProcessingStatus');
const ItemValidationEvent = require('../models/ItemValidationEvent');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hotel_id`,
                label: `The catalog hotel id in the merchant namespace - [${labelPrefix}hotel_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: ItemValidationEvent.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}warnings`,
                label: `[${labelPrefix}warnings]`,
                children: ItemValidationEvent.fields(`${keyPrefix}warnings${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}status`,
                ...ItemProcessingStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, ItemValidationEvent),
            'warnings': utils.childMapping(bundle.inputData?.[`${keyPrefix}warnings`], `${keyPrefix}warnings`, ItemValidationEvent),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
