const utils = require('../utils/utils');
const CatalogsType = require('../models/CatalogsType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `ID of the catalog entity. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `A human-friendly name associated to a catalog entity. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
        }
    },
}
