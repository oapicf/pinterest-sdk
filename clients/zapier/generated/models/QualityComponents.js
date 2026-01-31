const utils = require('../utils/utils');
const QualityComponentDetails = require('../models/QualityComponentDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...QualityComponentDetails.fields(`${keyPrefix}advertiser_external_id`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}click_id_epik`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}external_event_id`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}hashed_email`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}hashed_maid`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}ip_address`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}order_id`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}order_value`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}product_id`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}source_url`, isInput),
            ...QualityComponentDetails.fields(`${keyPrefix}user_agent`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'advertiser_external_id': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}advertiser_external_id`)),
            'click_id_epik': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}click_id_epik`)),
            'external_event_id': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}external_event_id`)),
            'hashed_email': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}hashed_email`)),
            'hashed_maid': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}hashed_maid`)),
            'ip_address': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}ip_address`)),
            'order_id': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}order_id`)),
            'order_value': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}order_value`)),
            'product_id': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}product_id`)),
            'source_url': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}source_url`)),
            'user_agent': utils.removeIfEmpty(QualityComponentDetails.mapping(bundle, `${keyPrefix}user_agent`)),
        }
    },
}
