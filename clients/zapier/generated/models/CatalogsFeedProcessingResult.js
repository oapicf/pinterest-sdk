const utils = require('../utils/utils');
const CatalogsFeedIngestionDetails = require('../models/CatalogsFeedIngestionDetails');
const CatalogsFeedProcessingStatus = require('../models/CatalogsFeedProcessingStatus');
const CatalogsFeedProductCounts = require('../models/CatalogsFeedProductCounts');
const CatalogsFeedValidationDetails = require('../models/CatalogsFeedValidationDetails');

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
            ...CatalogsFeedIngestionDetails.fields(`${keyPrefix}ingestion_details`, isInput),
            {
                key: `${keyPrefix}status`,
                ...CatalogsFeedProcessingStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...CatalogsFeedProductCounts.fields(`${keyPrefix}product_counts`, isInput),
            ...CatalogsFeedValidationDetails.fields(`${keyPrefix}validation_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'ingestion_details': utils.removeIfEmpty(CatalogsFeedIngestionDetails.mapping(bundle, `${keyPrefix}ingestion_details`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'product_counts': utils.removeIfEmpty(CatalogsFeedProductCounts.mapping(bundle, `${keyPrefix}product_counts`)),
            'validation_details': utils.removeIfEmpty(CatalogsFeedValidationDetails.mapping(bundle, `${keyPrefix}validation_details`)),
        }
    },
}
