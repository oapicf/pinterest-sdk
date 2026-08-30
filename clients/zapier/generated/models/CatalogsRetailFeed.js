const utils = require('../utils/utils');
const CatalogsFeedCredentials = require('../models/CatalogsFeedCredentials');
const CatalogsFeedProcessingSchedule = require('../models/CatalogsFeedProcessingSchedule');
const CatalogsFormat = require('../models/CatalogsFormat');
const CatalogsStatus = require('../models/CatalogsStatus');
const Country = require('../models/Country');
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
                    'RETAIL',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'string',
            },
            ...CatalogsFeedCredentials.fields(`${keyPrefix}credentials`, isInput),
            {
                key: `${keyPrefix}default_availability`,
                ...ProductAvailabilityType.fields(`${keyPrefix}default_availability`, isInput),
            },
            {
                key: `${keyPrefix}default_country`,
                ...Country.fields(`${keyPrefix}default_country`, isInput),
            },
            {
                key: `${keyPrefix}default_currency`,
                ...NullableCurrency.fields(`${keyPrefix}default_currency`, isInput),
            },
            {
                key: `${keyPrefix}default_locale`,
                label: `The locale used within a feed for product descriptions. - [${labelPrefix}default_locale]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                ...CatalogsFormat.fields(`${keyPrefix}format`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `ID of the feed entity. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}location`,
                label: `The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. - [${labelPrefix}location]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...CatalogsFeedProcessingSchedule.fields(`${keyPrefix}preferred_processing_schedule`, isInput),
            {
                key: `${keyPrefix}status`,
                ...CatalogsStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'credentials': utils.removeIfEmpty(CatalogsFeedCredentials.mapping(bundle, `${keyPrefix}credentials`)),
            'default_availability': bundle.inputData?.[`${keyPrefix}default_availability`],
            'default_country': bundle.inputData?.[`${keyPrefix}default_country`],
            'default_currency': bundle.inputData?.[`${keyPrefix}default_currency`],
            'default_locale': bundle.inputData?.[`${keyPrefix}default_locale`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'location': bundle.inputData?.[`${keyPrefix}location`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'preferred_processing_schedule': utils.removeIfEmpty(CatalogsFeedProcessingSchedule.mapping(bundle, `${keyPrefix}preferred_processing_schedule`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
        }
    },
}
