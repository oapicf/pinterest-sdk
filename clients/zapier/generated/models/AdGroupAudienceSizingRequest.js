const utils = require('../utils/utils');
const AdGroupAudienceSizingRequest_keywords_inner = require('../models/AdGroupAudienceSizingRequest_keywords_inner');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpec = require('../models/TargetingSpec');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}creative_types`,
                label: `Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. - [${labelPrefix}creative_types]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            ...TargetingSpec.fields(`${keyPrefix}targeting_spec`, isInput),
            {
                key: `${keyPrefix}product_group_ids`,
                label: `Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. - [${labelPrefix}product_group_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: AdGroupAudienceSizingRequest_keywords_inner.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'creative_types': bundle.inputData?.[`${keyPrefix}creative_types`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpec.mapping(bundle, `${keyPrefix}targeting_spec`)),
            'product_group_ids': bundle.inputData?.[`${keyPrefix}product_group_ids`],
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, AdGroupAudienceSizingRequest_keywords_inner),
        }
    },
}
