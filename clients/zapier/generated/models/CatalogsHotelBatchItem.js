const utils = require('../utils/utils');
const CatalogsCreateHotelItem = require('../models/CatalogsCreateHotelItem');
const CatalogsDeleteHotelItem = require('../models/CatalogsDeleteHotelItem');
const CatalogsUpdatableHotelAttributes = require('../models/CatalogsUpdatableHotelAttributes');
const CatalogsUpdateHotelItem = require('../models/CatalogsUpdateHotelItem');
const CatalogsUpsertHotelItem = require('../models/CatalogsUpsertHotelItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hotel_id`,
                label: `The catalog hotel id in the merchant namespace - [${labelPrefix}hotel_id]`,
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
            ...CatalogsUpdatableHotelAttributes.fields(`${keyPrefix}attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'attributes': utils.removeIfEmpty(CatalogsUpdatableHotelAttributes.mapping(bundle, `${keyPrefix}attributes`)),
        }
    },
}
