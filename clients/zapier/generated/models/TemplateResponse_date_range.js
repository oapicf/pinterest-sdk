const utils = require('../utils/utils');
const TemplateResponse_date_range_absolute_date_range = require('../models/TemplateResponse_date_range_absolute_date_range');
const TemplateResponse_date_range_dynamic_date_range = require('../models/TemplateResponse_date_range_dynamic_date_range');
const TemplateResponse_date_range_relative_date_range = require('../models/TemplateResponse_date_range_relative_date_range');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TemplateResponse_date_range_dynamic_date_range.fields(`${keyPrefix}dynamic_date_range`, isInput),
            ...TemplateResponse_date_range_relative_date_range.fields(`${keyPrefix}relative_date_range`, isInput),
            ...TemplateResponse_date_range_absolute_date_range.fields(`${keyPrefix}absolute_date_range`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dynamic_date_range': utils.removeIfEmpty(TemplateResponse_date_range_dynamic_date_range.mapping(bundle, `${keyPrefix}dynamic_date_range`)),
            'relative_date_range': utils.removeIfEmpty(TemplateResponse_date_range_relative_date_range.mapping(bundle, `${keyPrefix}relative_date_range`)),
            'absolute_date_range': utils.removeIfEmpty(TemplateResponse_date_range_absolute_date_range.mapping(bundle, `${keyPrefix}absolute_date_range`)),
        }
    },
}
