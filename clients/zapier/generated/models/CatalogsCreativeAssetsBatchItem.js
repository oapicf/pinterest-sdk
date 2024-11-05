const utils = require('../utils/utils');
const CatalogsCreateCreativeAssetsItem = require('../models/CatalogsCreateCreativeAssetsItem');
const CatalogsDeleteCreativeAssetsItem = require('../models/CatalogsDeleteCreativeAssetsItem');
const CatalogsUpdatableCreativeAssetsAttributes = require('../models/CatalogsUpdatableCreativeAssetsAttributes');
const CatalogsUpdateCreativeAssetsItem = require('../models/CatalogsUpdateCreativeAssetsItem');
const CatalogsUpsertCreativeAssetsItem = require('../models/CatalogsUpsertCreativeAssetsItem');

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
                    'DELETE',
                ],
            },
            ...CatalogsUpdatableCreativeAssetsAttributes.fields(`${keyPrefix}attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'attributes': utils.removeIfEmpty(CatalogsUpdatableCreativeAssetsAttributes.mapping(bundle, `${keyPrefix}attributes`)),
        }
    },
}
