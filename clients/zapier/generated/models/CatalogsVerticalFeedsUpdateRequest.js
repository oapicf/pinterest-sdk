const utils = require('../utils/utils');
const CatalogsCreativeAssetsFeedsUpdateRequest = require('../models/CatalogsCreativeAssetsFeedsUpdateRequest');
const CatalogsFeedCredentials = require('../models/CatalogsFeedCredentials');
const CatalogsFeedProcessingSchedule = require('../models/CatalogsFeedProcessingSchedule');
const CatalogsFormat = require('../models/CatalogsFormat');
const CatalogsHotelFeedsUpdateRequest = require('../models/CatalogsHotelFeedsUpdateRequest');
const CatalogsRetailFeedsUpdateRequest = require('../models/CatalogsRetailFeedsUpdateRequest');
const CatalogsStatus = require('../models/CatalogsStatus');
const NullableCurrency = require('../models/NullableCurrency');
const ProductAvailabilityType = require('../models/ProductAvailabilityType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'CREATIVE_ASSETS',
                ],
            },
            ...CatalogsFeedCredentials.fields(`${keyPrefix}credentials`, isInput),
            {
                key: `${keyPrefix}default_availability`,
                ...ProductAvailabilityType.fields(`${keyPrefix}default_availability`, isInput),
            },
            {
                key: `${keyPrefix}default_currency`,
                ...NullableCurrency.fields(`${keyPrefix}default_currency`, isInput),
            },
            {
                key: `${keyPrefix}format`,
                ...CatalogsFormat.fields(`${keyPrefix}format`, isInput),
            },
            {
                key: `${keyPrefix}location`,
                label: `The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. - [${labelPrefix}location]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `A human-friendly name associated to a given feed. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...CatalogsFeedProcessingSchedule.fields(`${keyPrefix}preferred_processing_schedule`, isInput),
            {
                key: `${keyPrefix}status`,
                ...CatalogsStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'credentials': utils.removeIfEmpty(CatalogsFeedCredentials.mapping(bundle, `${keyPrefix}credentials`)),
            'default_availability': bundle.inputData?.[`${keyPrefix}default_availability`],
            'default_currency': bundle.inputData?.[`${keyPrefix}default_currency`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'location': bundle.inputData?.[`${keyPrefix}location`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'preferred_processing_schedule': utils.removeIfEmpty(CatalogsFeedProcessingSchedule.mapping(bundle, `${keyPrefix}preferred_processing_schedule`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
