const utils = require('../utils/utils');
const CatalogsItemValidationErrors = require('../models/CatalogsItemValidationErrors');
const CatalogsItemValidationWarnings = require('../models/CatalogsItemValidationWarnings');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_number`,
                label: `Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. - [${labelPrefix}item_number]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The merchant-created unique ID that represents the product. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            ...CatalogsItemValidationErrors.fields(`${keyPrefix}errors`, isInput),
            ...CatalogsItemValidationWarnings.fields(`${keyPrefix}warnings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_number': bundle.inputData?.[`${keyPrefix}item_number`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'errors': utils.removeIfEmpty(CatalogsItemValidationErrors.mapping(bundle, `${keyPrefix}errors`)),
            'warnings': utils.removeIfEmpty(CatalogsItemValidationWarnings.mapping(bundle, `${keyPrefix}warnings`)),
        }
    },
}
