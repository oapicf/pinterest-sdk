const utils = require('../utils/utils');
const IngestionSourceOptions = require('../models/IngestionSourceOptions');
const LookbackPeriodOptions = require('../models/LookbackPeriodOptions');
const OverallStatusOptions = require('../models/OverallStatusOptions');
const QualityComponents = require('../models/QualityComponents');
const SourcePlatformOptions = require('../models/SourcePlatformOptions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ingestion_source`,
                ...IngestionSourceOptions.fields(`${keyPrefix}ingestion_source`, isInput),
            },
            {
                key: `${keyPrefix}lookback_period`,
                ...LookbackPeriodOptions.fields(`${keyPrefix}lookback_period`, isInput),
            },
            {
                key: `${keyPrefix}overall_status`,
                ...OverallStatusOptions.fields(`${keyPrefix}overall_status`, isInput),
            },
            ...QualityComponents.fields(`${keyPrefix}quality_components`, isInput),
            {
                key: `${keyPrefix}source_platform`,
                ...SourcePlatformOptions.fields(`${keyPrefix}source_platform`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ingestion_source': bundle.inputData?.[`${keyPrefix}ingestion_source`],
            'lookback_period': bundle.inputData?.[`${keyPrefix}lookback_period`],
            'overall_status': bundle.inputData?.[`${keyPrefix}overall_status`],
            'quality_components': utils.removeIfEmpty(QualityComponents.mapping(bundle, `${keyPrefix}quality_components`)),
            'source_platform': bundle.inputData?.[`${keyPrefix}source_platform`],
        }
    },
}
