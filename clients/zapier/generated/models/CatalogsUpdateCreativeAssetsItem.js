const utils = require('../utils/utils');
const CatalogsUpdatableCreativeAssetsAttributes = require('../models/CatalogsUpdatableCreativeAssetsAttributes');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsUpdatableCreativeAssetsAttributes.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}creative_assets_id`,
                label: `The catalog creative assets item id in the merchant namespace - [${labelPrefix}creative_assets_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation`,
                label: `[${labelPrefix}operation]`,
                required: true,
                type: 'string',
                choices: [
                    'UPDATE',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(CatalogsUpdatableCreativeAssetsAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
        }
    },
}
