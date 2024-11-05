const utils = require('../utils/utils');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpec = require('../models/TargetingSpec');
const TargetingTemplateKeyword = require('../models/TargetingTemplateKeyword');
const TrackingUrls = require('../models/TrackingUrls');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `targeting template name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            ...TargetingSpec.fields(`${keyPrefix}targeting_attributes`, isInput),
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: TargetingTemplateKeyword.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...TrackingUrls.fields(`${keyPrefix}tracking_urls`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'targeting_attributes': utils.removeIfEmpty(TargetingSpec.mapping(bundle, `${keyPrefix}targeting_attributes`)),
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, TargetingTemplateKeyword),
            'tracking_urls': utils.removeIfEmpty(TrackingUrls.mapping(bundle, `${keyPrefix}tracking_urls`)),
        }
    },
}
