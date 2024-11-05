const utils = require('../utils/utils');
const CatalogsCreativeAssetsAttributes = require('../models/CatalogsCreativeAssetsAttributes');
const CatalogsType = require('../models/CatalogsType');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}creative_assets_id`,
                label: `The catalog creative assets id in the merchant namespace - [${labelPrefix}creative_assets_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: Pin.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CatalogsCreativeAssetsAttributes.fields(`${keyPrefix}attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
            'attributes': utils.removeIfEmpty(CatalogsCreativeAssetsAttributes.mapping(bundle, `${keyPrefix}attributes`)),
        }
    },
}
