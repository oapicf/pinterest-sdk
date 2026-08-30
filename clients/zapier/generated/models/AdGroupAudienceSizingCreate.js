const utils = require('../utils/utils');
const AdGroupAudienceSizingCreativeTypes = require('../models/AdGroupAudienceSizingCreativeTypes');
const AdGroupAudienceSizingKeyword = require('../models/AdGroupAudienceSizingKeyword');
const AdgroupPlacementGroupType = require('../models/AdgroupPlacementGroupType');
const TargetingSpecOptimal = require('../models/TargetingSpecOptimal');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}creative_types`,
                list: true,
                type: 'string',
                ...AdGroupAudienceSizingCreativeTypes.fields(`${keyPrefix}creative_types`, isInput),
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: AdGroupAudienceSizingKeyword.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}placement_group`,
                ...AdgroupPlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}product_group_ids`,
                label: `Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. - [${labelPrefix}product_group_ids]`,
                list: true,
                type: 'string',
            },
            ...TargetingSpecOptimal.fields(`${keyPrefix}targeting_spec`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'creative_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}creative_types`], `${keyPrefix}creative_types`, AdGroupAudienceSizingCreativeTypes),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, AdGroupAudienceSizingKeyword),
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'product_group_ids': bundle.inputData?.[`${keyPrefix}product_group_ids`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpecOptimal.mapping(bundle, `${keyPrefix}targeting_spec`)),
        }
    },
}
