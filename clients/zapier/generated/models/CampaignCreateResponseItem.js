const utils = require('../utils/utils');
const CampaignCreateResponseData = require('../models/CampaignCreateResponseData');
const Exception = require('../models/Exception');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignCreateResponseData.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: Exception.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(CampaignCreateResponseData.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, Exception),
        }
    },
}
