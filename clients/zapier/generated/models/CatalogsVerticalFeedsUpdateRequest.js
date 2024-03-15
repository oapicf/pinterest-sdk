const utils = require('../utils/utils');
const CatalogsFeedCredentials = require('../models/CatalogsFeedCredentials');
const CatalogsFeedProcessingSchedule = require('../models/CatalogsFeedProcessingSchedule');
const CatalogsFormat = require('../models/CatalogsFormat');
const CatalogsHotelFeedsUpdateRequest = require('../models/CatalogsHotelFeedsUpdateRequest');
const CatalogsRetailFeedsUpdateRequest = require('../models/CatalogsRetailFeedsUpdateRequest');
const CatalogsStatus = require('../models/CatalogsStatus');
const CatalogsType = require('../models/CatalogsType');
const NullableCurrency = require('../models/NullableCurrency');
const ProductAvailabilityType = require('../models/ProductAvailabilityType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}default_currency`,
                ...NullableCurrency.fields(`${keyPrefix}default_currency`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `A human-friendly name associated to a given feed. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                ...CatalogsFormat.fields(`${keyPrefix}format`, isInput),
            },
            ...CatalogsFeedCredentials.fields(`${keyPrefix}credentials`, isInput),
            {
                key: `${keyPrefix}location`,
                label: `The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. - [${labelPrefix}location]`,
                type: 'string',
            },
            ...CatalogsFeedProcessingSchedule.fields(`${keyPrefix}preferred_processing_schedule`, isInput),
            {
                key: `${keyPrefix}status`,
                ...CatalogsStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}default_availability`,
                ...ProductAvailabilityType.fields(`${keyPrefix}default_availability`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default_currency': bundle.inputData?.[`${keyPrefix}default_currency`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'credentials': utils.removeIfEmpty(CatalogsFeedCredentials.mapping(bundle, `${keyPrefix}credentials`)),
            'location': bundle.inputData?.[`${keyPrefix}location`],
            'preferred_processing_schedule': utils.removeIfEmpty(CatalogsFeedProcessingSchedule.mapping(bundle, `${keyPrefix}preferred_processing_schedule`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'default_availability': bundle.inputData?.[`${keyPrefix}default_availability`],
        }
    },
}
