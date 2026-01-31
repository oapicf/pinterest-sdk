const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}conversionType`,
                label: `Status for conversion types - [${labelPrefix}conversionType]`,
                dict: true,
            },
            {
                key: `${keyPrefix}criteria`,
                label: `Status for criteria - [${labelPrefix}criteria]`,
                dict: true,
            },
            {
                key: `${keyPrefix}ingestionSource`,
                label: `Status for ingestion sources - [${labelPrefix}ingestionSource]`,
                dict: true,
            },
            ....fields(`${keyPrefix}status`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'conversionType': bundle.inputData?.[`${keyPrefix}conversionType`],
            'criteria': bundle.inputData?.[`${keyPrefix}criteria`],
            'ingestionSource': bundle.inputData?.[`${keyPrefix}ingestionSource`],
            'status': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}status`)),
        }
    },
}
