const utils = require('../utils/utils');
const campaign_ad_preview_delete_200_response_inner_status = require('../models/campaign_ad_preview_delete_200_response_inner_status');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...campaign_ad_preview_delete_200_response_inner_status.fields(`${keyPrefix}status`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': utils.removeIfEmpty(campaign_ad_preview_delete_200_response_inner_status.mapping(bundle, `${keyPrefix}status`)),
        }
    },
}
