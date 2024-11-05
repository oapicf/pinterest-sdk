const utils = require('../utils/utils');
const CatalogsReportDistributionIssueFilter = require('../models/CatalogsReportDistributionIssueFilter');
const CatalogsReportFeedIngestionFilter = require('../models/CatalogsReportFeedIngestionFilter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_type`,
                label: `[${labelPrefix}report_type]`,
                type: 'string',
                choices: [
                    'FEED_INGESTION_ISSUES',
                    'DISTRIBUTION_ISSUES',
                ],
            },
            {
                key: `${keyPrefix}feed_id`,
                label: `ID of the feed entity. - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}processing_result_id`,
                label: `Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. - [${labelPrefix}processing_result_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Unique identifier of a catalog. If not given, oldest catalog will be used - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_type': bundle.inputData?.[`${keyPrefix}report_type`],
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'processing_result_id': bundle.inputData?.[`${keyPrefix}processing_result_id`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
