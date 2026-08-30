const utils = require('../utils/utils');
const AdGroup = require('../models/AdGroup');
const Pinterest.Lib.BatchItemException = require('../models/Pinterest.Lib.BatchItemException');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AdGroup.fields(`${keyPrefix}data`, isInput),
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
            'data': utils.removeIfEmpty(AdGroup.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, Pinterest.Lib.BatchItemException),
        }
    },
}
