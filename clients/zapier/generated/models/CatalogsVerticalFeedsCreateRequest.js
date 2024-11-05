const utils = require('../utils/utils');
const CatalogsCreativeAssetsFeedsCreateRequest = require('../models/CatalogsCreativeAssetsFeedsCreateRequest');
const CatalogsFeedCredentials = require('../models/CatalogsFeedCredentials');
const CatalogsFeedProcessingSchedule = require('../models/CatalogsFeedProcessingSchedule');
const CatalogsFeedsCreateRequest_default_locale = require('../models/CatalogsFeedsCreateRequest_default_locale');
const CatalogsFormat = require('../models/CatalogsFormat');
const CatalogsHotelFeedsCreateRequest = require('../models/CatalogsHotelFeedsCreateRequest');
const CatalogsRetailFeedsCreateRequest = require('../models/CatalogsRetailFeedsCreateRequest');
const CatalogsStatus = require('../models/CatalogsStatus');
const CatalogsType = require('../models/CatalogsType');
const Country = require('../models/Country');
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
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                ...CatalogsFormat.fields(`${keyPrefix}format`, isInput),
            },
            ...CatalogsFeedsCreateRequest_default_locale.fields(`${keyPrefix}default_locale`, isInput),
            ...CatalogsFeedCredentials.fields(`${keyPrefix}credentials`, isInput),
            {
                key: `${keyPrefix}location`,
                label: `The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. - [${labelPrefix}location]`,
                required: true,
                type: 'string',
            },
            ...CatalogsFeedProcessingSchedule.fields(`${keyPrefix}preferred_processing_schedule`, isInput),
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}default_country`,
                ...Country.fields(`${keyPrefix}default_country`, isInput),
            },
            {
                key: `${keyPrefix}default_availability`,
                ...ProductAvailabilityType.fields(`${keyPrefix}default_availability`, isInput),
            },
            ...CatalogsStatus.fields(`${keyPrefix}status`, isInput),
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default_currency': bundle.inputData?.[`${keyPrefix}default_currency`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'default_locale': utils.removeIfEmpty(CatalogsFeedsCreateRequest_default_locale.mapping(bundle, `${keyPrefix}default_locale`)),
            'credentials': utils.removeIfEmpty(CatalogsFeedCredentials.mapping(bundle, `${keyPrefix}credentials`)),
            'location': bundle.inputData?.[`${keyPrefix}location`],
            'preferred_processing_schedule': utils.removeIfEmpty(CatalogsFeedProcessingSchedule.mapping(bundle, `${keyPrefix}preferred_processing_schedule`)),
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'default_country': bundle.inputData?.[`${keyPrefix}default_country`],
            'default_availability': bundle.inputData?.[`${keyPrefix}default_availability`],
            'status': utils.removeIfEmpty(CatalogsStatus.mapping(bundle, `${keyPrefix}status`)),
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
