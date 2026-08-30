const utils = require('../utils/utils');
const LeadForm = require('../models/LeadForm');
const Pinterest.Lib.BatchItemException = require('../models/Pinterest.Lib.BatchItemException');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...LeadForm.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: Pinterest.Lib.BatchItemException.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(LeadForm.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, Pinterest.Lib.BatchItemException),
        }
    },
}
