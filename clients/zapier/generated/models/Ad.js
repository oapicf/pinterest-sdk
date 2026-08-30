const utils = require('../utils/utils');
const AdCollectionsHeaderType = require('../models/AdCollectionsHeaderType');
const AdDisapprovalReasons = require('../models/AdDisapprovalReasons');
const AdReviewStatus = require('../models/AdReviewStatus');
const CartingProduct = require('../models/CartingProduct');
const CreativeType = require('../models/CreativeType');
const CustomizableCTAType = require('../models/CustomizableCTAType');
const DisclosureType = require('../models/DisclosureType');
const EntityStatus = require('../models/EntityStatus');
const GridClickType = require('../models/GridClickType');
const PinPromotionSummaryStatus = require('../models/PinPromotionSummaryStatus');
const QuizPinData = require('../models/QuizPinData');
const TrackingUrls = require('../models/TrackingUrls');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the advertiser that this ad belongs to. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_group_id`,
                label: `ID of the ad group that contains the ad. - [${labelPrefix}ad_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}android_deep_link`,
                label: `Deep link URL for Android devices. - [${labelPrefix}android_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `ID of the ad campaign that contains this ad. - [${labelPrefix}campaign_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_android_deep_links`,
                label: `Comma-separated deep links for the carousel pin on Android. - [${labelPrefix}carousel_android_deep_links]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_destination_urls`,
                label: `Comma-separated destination URLs for the carousel pin to promote. - [${labelPrefix}carousel_destination_urls]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_ios_deep_links`,
                label: `Comma-separated deep links for the carousel pin on iOS. - [${labelPrefix}carousel_ios_deep_links]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carting_platform_type`,
                label: `The vendor platform type of the carting/WTB ad. - [${labelPrefix}carting_platform_type]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}carting_products`,
                label: `[${labelPrefix}carting_products]`,
                children: CartingProduct.fields(`${keyPrefix}carting_products${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}click_tracking_url`,
                label: `Tracking url for the ad clicks. - [${labelPrefix}click_tracking_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collection_items_destination_url_template`,
                label: `Destination URL template for all items within a collections drawer. - [${labelPrefix}collection_items_destination_url_template]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collections_header_type`,
                ...AdCollectionsHeaderType.fields(`${keyPrefix}collections_header_type`, isInput),
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Pin creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}customizable_cta_type`,
                ...CustomizableCTAType.fields(`${keyPrefix}customizable_cta_type`, isInput),
            },
            {
                key: `${keyPrefix}destination_url`,
                label: `Destination URL. - [${labelPrefix}destination_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}disclosure_type`,
                ...DisclosureType.fields(`${keyPrefix}disclosure_type`, isInput),
            },
            {
                key: `${keyPrefix}disclosure_url`,
                label: `URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. - [${labelPrefix}disclosure_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}grid_click_type`,
                ...GridClickType.fields(`${keyPrefix}grid_click_type`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of this ad. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ios_deep_link`,
                label: `Deep link URL for iOS devices. - [${labelPrefix}ios_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_carting`,
                label: `Is the ad a carting/WTB ad? - [${labelPrefix}is_carting]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_collage_accepted_terms`,
                label: `Whether the advertiser has accepted the terms and conditions for collage ad. - [${labelPrefix}is_collage_accepted_terms]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_collage_single_destination`,
                label: `Whether the collage ad has a single destination url override. - [${labelPrefix}is_collage_single_destination]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_pin_deleted`,
                label: `Is original pin deleted? - [${labelPrefix}is_pin_deleted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_removable`,
                label: `Is pin repinnable? - [${labelPrefix}is_removable]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}lead_form_id`,
                label: `Lead form ID for lead ad generation. - [${labelPrefix}lead_form_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of the ad - 255 chars max. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID. This field may only be updated for draft ads. - [${labelPrefix}pin_id]`,
                required: true,
                type: 'string',
            },
            ...QuizPinData.fields(`${keyPrefix}quiz_pin_data`, isInput),
            {
                key: `${keyPrefix}rejected_reasons`,
                list: true,
                type: 'string',
                ...AdDisapprovalReasons.fields(`${keyPrefix}rejected_reasons`, isInput),
            },
            {
                key: `${keyPrefix}rejection_labels`,
                label: `Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". - [${labelPrefix}rejection_labels]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}review_status`,
                ...AdReviewStatus.fields(`${keyPrefix}review_status`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}summary_status`,
                ...PinPromotionSummaryStatus.fields(`${keyPrefix}summary_status`, isInput),
            },
            ...TrackingUrls.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}type`,
                label: `Always \"ad\". - [${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}view_tracking_url`,
                label: `Tracking URL for ad impressions. - [${labelPrefix}view_tracking_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'android_deep_link': bundle.inputData?.[`${keyPrefix}android_deep_link`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'carousel_android_deep_links': bundle.inputData?.[`${keyPrefix}carousel_android_deep_links`],
            'carousel_destination_urls': bundle.inputData?.[`${keyPrefix}carousel_destination_urls`],
            'carousel_ios_deep_links': bundle.inputData?.[`${keyPrefix}carousel_ios_deep_links`],
            'carting_platform_type': bundle.inputData?.[`${keyPrefix}carting_platform_type`],
            'carting_products': utils.childMapping(bundle.inputData?.[`${keyPrefix}carting_products`], `${keyPrefix}carting_products`, CartingProduct),
            'click_tracking_url': bundle.inputData?.[`${keyPrefix}click_tracking_url`],
            'collection_items_destination_url_template': bundle.inputData?.[`${keyPrefix}collection_items_destination_url_template`],
            'collections_header_type': bundle.inputData?.[`${keyPrefix}collections_header_type`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'customizable_cta_type': bundle.inputData?.[`${keyPrefix}customizable_cta_type`],
            'destination_url': bundle.inputData?.[`${keyPrefix}destination_url`],
            'disclosure_type': bundle.inputData?.[`${keyPrefix}disclosure_type`],
            'disclosure_url': bundle.inputData?.[`${keyPrefix}disclosure_url`],
            'grid_click_type': bundle.inputData?.[`${keyPrefix}grid_click_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ios_deep_link': bundle.inputData?.[`${keyPrefix}ios_deep_link`],
            'is_carting': bundle.inputData?.[`${keyPrefix}is_carting`],
            'is_collage_accepted_terms': bundle.inputData?.[`${keyPrefix}is_collage_accepted_terms`],
            'is_collage_single_destination': bundle.inputData?.[`${keyPrefix}is_collage_single_destination`],
            'is_pin_deleted': bundle.inputData?.[`${keyPrefix}is_pin_deleted`],
            'is_removable': bundle.inputData?.[`${keyPrefix}is_removable`],
            'lead_form_id': bundle.inputData?.[`${keyPrefix}lead_form_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
            'quiz_pin_data': utils.removeIfEmpty(QuizPinData.mapping(bundle, `${keyPrefix}quiz_pin_data`)),
            'rejected_reasons': utils.childMapping(bundle.inputData?.[`${keyPrefix}rejected_reasons`], `${keyPrefix}rejected_reasons`, AdDisapprovalReasons),
            'rejection_labels': bundle.inputData?.[`${keyPrefix}rejection_labels`],
            'review_status': bundle.inputData?.[`${keyPrefix}review_status`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'summary_status': bundle.inputData?.[`${keyPrefix}summary_status`],
            'tracking_urls': utils.removeIfEmpty(TrackingUrls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'view_tracking_url': bundle.inputData?.[`${keyPrefix}view_tracking_url`],
        }
    },
}
