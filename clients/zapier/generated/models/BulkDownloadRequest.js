const utils = require('../utils/utils');
const BulkDownloadRequest_campaign_filter = require('../models/BulkDownloadRequest_campaign_filter');
const BulkEntityType = require('../models/BulkEntityType');
const BulkOutputFormat = require('../models/BulkOutputFormat');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entity_types`,
                list: true,
                type: 'string',
                ...BulkEntityType.fields(`${keyPrefix}entity_types`, isInput),
            },
            {
                key: `${keyPrefix}entity_ids`,
                label: `All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. - [${labelPrefix}entity_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_since`,
                label: `Unix UTC timestamp to retrieve all entities that have changed since this time. - [${labelPrefix}updated_since]`,
                type: 'string',
            },
            ...BulkDownloadRequest_campaign_filter.fields(`${keyPrefix}campaign_filter`, isInput),
            {
                key: `${keyPrefix}output_format`,
                ...BulkOutputFormat.fields(`${keyPrefix}output_format`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entity_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}entity_types`], `${keyPrefix}entity_types`, BulkEntityType),
            'entity_ids': bundle.inputData?.[`${keyPrefix}entity_ids`],
            'updated_since': bundle.inputData?.[`${keyPrefix}updated_since`],
            'campaign_filter': utils.removeIfEmpty(BulkDownloadRequest_campaign_filter.mapping(bundle, `${keyPrefix}campaign_filter`)),
            'output_format': bundle.inputData?.[`${keyPrefix}output_format`],
        }
    },
}
