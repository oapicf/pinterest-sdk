const utils = require('../utils/utils');
const CatalogsCreativeAssetsAttributes = require('../models/CatalogsCreativeAssetsAttributes');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}creative_assets_id`,
                label: `The catalog creative assets id in the merchant namespace - [${labelPrefix}creative_assets_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation`,
                label: `[${labelPrefix}operation]`,
                required: true,
                type: 'string',
                choices: [
                    'CREATE',
                ],
            },
            ...CatalogsCreativeAssetsAttributes.fields(`${keyPrefix}attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'attributes': utils.removeIfEmpty(CatalogsCreativeAssetsAttributes.mapping(bundle, `${keyPrefix}attributes`)),
        }
    },
}
