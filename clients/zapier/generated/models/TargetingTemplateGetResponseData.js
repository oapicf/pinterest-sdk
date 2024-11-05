const utils = require('../utils/utils');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpec = require('../models/TargetingSpec');
const TargetingTemplateAudienceSizing = require('../models/TargetingTemplateAudienceSizing');
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
            {
                key: `${keyPrefix}id`,
                label: `Targeting template ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Targeting template created time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Targeting template updated time.Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the advertiser that this targeting template belongs to. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `Indicate targeting template is active or Deleted - [${labelPrefix}status]`,
                type: 'string',
                choices: [
                    'ACTIVE',
                    'DELETED',
                ],
            },
            ...TargetingTemplateAudienceSizing.fields(`${keyPrefix}sizing`, isInput),
            {
                key: `${keyPrefix}valid`,
                label: `Inform if the targeting template is valid (ex. would be false if has revoked audience) - [${labelPrefix}valid]`,
                type: 'boolean',
            },
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'sizing': utils.removeIfEmpty(TargetingTemplateAudienceSizing.mapping(bundle, `${keyPrefix}sizing`)),
            'valid': bundle.inputData?.[`${keyPrefix}valid`],
        }
    },
}
