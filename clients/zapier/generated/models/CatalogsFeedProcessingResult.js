const utils = require('../utils/utils');
const CatalogsFeedIngestionDetails = require('../models/CatalogsFeedIngestionDetails');
const CatalogsFeedProcessingStatus = require('../models/CatalogsFeedProcessingStatus');
const CatalogsFeedProductCounts = require('../models/CatalogsFeedProductCounts');
const CatalogsFeedValidationDetails = require('../models/CatalogsFeedValidationDetails');
const CatalogsFeedVideoCounts = require('../models/CatalogsFeedVideoCounts');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                required: true,
                type: 'string',
            },
            ...CatalogsFeedIngestionDetails.fields(`${keyPrefix}ingestion_details`, isInput),
            ...CatalogsFeedProductCounts.fields(`${keyPrefix}product_counts`, isInput),
            {
                key: `${keyPrefix}status`,
                ...CatalogsFeedProcessingStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...CatalogsFeedValidationDetails.fields(`${keyPrefix}validation_details`, isInput),
            ...CatalogsFeedVideoCounts.fields(`${keyPrefix}video_counts`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'ingestion_details': utils.removeIfEmpty(CatalogsFeedIngestionDetails.mapping(bundle, `${keyPrefix}ingestion_details`)),
            'product_counts': utils.removeIfEmpty(CatalogsFeedProductCounts.mapping(bundle, `${keyPrefix}product_counts`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'validation_details': utils.removeIfEmpty(CatalogsFeedValidationDetails.mapping(bundle, `${keyPrefix}validation_details`)),
            'video_counts': utils.removeIfEmpty(CatalogsFeedVideoCounts.mapping(bundle, `${keyPrefix}video_counts`)),
        }
    },
}
