const utils = require('../utils/utils');
const ObjectiveType = require('../models/ObjectiveType');
const PinterestTagEventData = require('../models/PinterestTagEventData');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                label: `Valid countries include: \"US\", \"CA\", and \"GB\". - [${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}customer_list_id`,
                label: `Customer list ID. For CUSTOMER_LIST `audience_type`. - [${labelPrefix}customer_list_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}engagement_domain`,
                label: `The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. - [${labelPrefix}engagement_domain]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}engagement_type`,
                label: `Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  - [${labelPrefix}engagement_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}event`,
                label: `A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. - [${labelPrefix}event]`,
                type: 'string',
            },
            ...PinterestTagEventData.fields(`${keyPrefix}event_data`, isInput),
            {
                key: `${keyPrefix}percentage`,
                label: `Percentage should be 1-10. The targeted audience should be this % size across Pinterest. - [${labelPrefix}percentage]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] - [${labelPrefix}pin_id]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}prefill`,
                label: `Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. - [${labelPrefix}prefill]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}retention_days`,
                label: `Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. - [${labelPrefix}retention_days]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}seed_id`,
                label: `Audience ID(s). For ACTALIKE `audience_type`.  - [${labelPrefix}seed_id]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} - [${labelPrefix}url]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}visitor_source_id`,
                label: `The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. - [${labelPrefix}visitor_source_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}event_source`,
                label: `Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline - [${labelPrefix}event_source]`,
                dict: true,
            },
            {
                key: `${keyPrefix}ingestion_source`,
                label: `Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api - [${labelPrefix}ingestion_source]`,
                dict: true,
            },
            {
                key: `${keyPrefix}engager_type`,
                label: `Optional for ENGAGEMENT. Engager type value should be 1-2. - [${labelPrefix}engager_type]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `Campaign ID for engagement audience filter. - [${labelPrefix}campaign_id]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_id`,
                label: `Ad ID for engagement audience filter. - [${labelPrefix}ad_id]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}objective_type`,
                list: true,
                type: 'string',
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Ad account ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'customer_list_id': bundle.inputData?.[`${keyPrefix}customer_list_id`],
            'engagement_domain': bundle.inputData?.[`${keyPrefix}engagement_domain`],
            'engagement_type': bundle.inputData?.[`${keyPrefix}engagement_type`],
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'event_data': utils.removeIfEmpty(PinterestTagEventData.mapping(bundle, `${keyPrefix}event_data`)),
            'percentage': bundle.inputData?.[`${keyPrefix}percentage`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
            'prefill': bundle.inputData?.[`${keyPrefix}prefill`],
            'retention_days': bundle.inputData?.[`${keyPrefix}retention_days`],
            'seed_id': bundle.inputData?.[`${keyPrefix}seed_id`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'visitor_source_id': bundle.inputData?.[`${keyPrefix}visitor_source_id`],
            'event_source': bundle.inputData?.[`${keyPrefix}event_source`],
            'ingestion_source': bundle.inputData?.[`${keyPrefix}ingestion_source`],
            'engager_type': bundle.inputData?.[`${keyPrefix}engager_type`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'ad_id': bundle.inputData?.[`${keyPrefix}ad_id`],
            'objective_type': utils.childMapping(bundle.inputData?.[`${keyPrefix}objective_type`], `${keyPrefix}objective_type`, ObjectiveType),
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
        }
    },
}
