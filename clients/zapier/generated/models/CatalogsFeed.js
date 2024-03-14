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
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}default_country`,
                ...Country.fields(`${keyPrefix}default_country`, isInput),
            },
            {
                key: `${keyPrefix}default_availability`,
                ...ProductAvailabilityType.fields(`${keyPrefix}default_availability`, isInput),
            },
            {
                key: `${keyPrefix}default_currency`,
                ...NullableCurrency.fields(`${keyPrefix}default_currency`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                ...CatalogsFormat.fields(`${keyPrefix}format`, isInput),
            },
            {
                key: `${keyPrefix}default_locale`,
                label: `The locale used within a feed for product descriptions. - [${labelPrefix}default_locale]`,
                required: true,
                type: 'string',
            },
            ...CatalogsFeedCredentials.fields(`${keyPrefix}credentials`, isInput),
            {
                key: `${keyPrefix}location`,
                label: `The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. - [${labelPrefix}location]`,
                required: true,
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
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'default_country': bundle.inputData?.[`${keyPrefix}default_country`],
            'default_availability': bundle.inputData?.[`${keyPrefix}default_availability`],
            'default_currency': bundle.inputData?.[`${keyPrefix}default_currency`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'default_locale': bundle.inputData?.[`${keyPrefix}default_locale`],
            'credentials': utils.removeIfEmpty(CatalogsFeedCredentials.mapping(bundle, `${keyPrefix}credentials`)),
            'location': bundle.inputData?.[`${keyPrefix}location`],
            'preferred_processing_schedule': utils.removeIfEmpty(CatalogsFeedProcessingSchedule.mapping(bundle, `${keyPrefix}preferred_processing_schedule`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
