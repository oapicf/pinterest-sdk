const utils = require('../utils/utils');
const InnerProductCategoriesMetricsHighlights = require('../models/InnerProductCategoriesMetricsHighlights');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InnerProductCategoriesMetricsHighlights.fields(`${keyPrefix}engagement`, isInput),
            ...InnerProductCategoriesMetricsHighlights.fields(`${keyPrefix}outbound_clicks`, isInput),
            ...InnerProductCategoriesMetricsHighlights.fields(`${keyPrefix}pin_saves`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'engagement': utils.removeIfEmpty(InnerProductCategoriesMetricsHighlights.mapping(bundle, `${keyPrefix}engagement`)),
            'outbound_clicks': utils.removeIfEmpty(InnerProductCategoriesMetricsHighlights.mapping(bundle, `${keyPrefix}outbound_clicks`)),
            'pin_saves': utils.removeIfEmpty(InnerProductCategoriesMetricsHighlights.mapping(bundle, `${keyPrefix}pin_saves`)),
        }
    },
}
