const utils = require('../utils/utils');
const CatalogsHotelAttributes = require('../models/CatalogsHotelAttributes');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsHotelAttributes.fields(`${keyPrefix}attributes`, isInput),
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
                    'UPSERT',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(CatalogsHotelAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
        }
    },
}
