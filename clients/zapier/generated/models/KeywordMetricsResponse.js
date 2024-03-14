const utils = require('../utils/utils');
const KeywordMetrics = require('../models/KeywordMetrics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}keyword`,
                label: `Keyword name, e.g., \"keyword\":\"fashion outfits\" - [${labelPrefix}keyword]`,
                type: 'string',
            },
            ...KeywordMetrics.fields(`${keyPrefix}metrics`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'keyword': bundle.inputData?.[`${keyPrefix}keyword`],
            'metrics': utils.removeIfEmpty(KeywordMetrics.mapping(bundle, `${keyPrefix}metrics`)),
        }
    },
}
