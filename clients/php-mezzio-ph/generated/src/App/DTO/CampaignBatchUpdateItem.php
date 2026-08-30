<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Single campaign update item with update-specific bid options.
 */
class CampaignBatchUpdateItem
{
    /**
     * Setting this field does nothing. The ad account ID gets set from the path parameter.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
     * @DTA\Data(field="app_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $app_id;

    /**
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.
     * @DTA\Data(field="app_platform", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MobileAppPlatform::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MobileAppPlatform::class})
     * @var \App\DTO\MobileAppPlatform|null
     */
    public $app_platform;

    /**
     * Object describing an update to the campaign level bid multipliers.
     * @DTA\Data(field="bid_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     * @var \App\DTO\CampaignBidOptionsUpdate|null
     */
    public $bid_options;

    /**
     * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @DTA\Data(field="daily_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $daily_spend_cap;

    /**
     * Setting this field does nothing.
     * @DTA\Data(field="default_ad_group_budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $default_ad_group_budget_in_micro_currency;

    /**
     * Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * Campaign ID, must be associated with the ad account ID provided in the path.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="intended_promotion_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntendedPromotionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntendedPromotionType::class})
     * @var \App\DTO\IntendedPromotionType|null
     */
    public $intended_promotion_type;

    /**
     * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
     * @DTA\Data(field="is_automated_campaign", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_automated_campaign;

    /**
     * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
     * @DTA\Data(field="is_campaign_budget_optimization", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_campaign_budget_optimization;

    /**
     * Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
     * @DTA\Data(field="is_flexible_daily_budgets", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_flexible_daily_budgets;

    /**
     * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @DTA\Data(field="is_ltv_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_ltv_optimized;

    /**
     * Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
     * @DTA\Data(field="is_performance_plus", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_performance_plus;

    /**
     * Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
     * @DTA\Data(field="is_top_of_search", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_top_of_search;

    /**
     * Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
     * @DTA\Data(field="lifetime_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_spend_cap;

    /**
     * Campaign name - 255 chars max.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionObjectiveType::class})
     * @var \App\DTO\ConversionObjectiveType|null
     */
    public $objective_type;

    /**
     * Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
     * @DTA\Data(field="order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $order_line_id;

    /**
     * Pinterest Performance+ campaign settings.
     * @DTA\Data(field="performance_plus_campaign_settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PerformancePlusCampaignSettings::class})
     * @var \App\DTO\PerformancePlusCampaignSettings|null
     */
    public $performance_plus_campaign_settings;

    /**
     * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrackingUrls::class})
     * @var \App\DTO\TrackingUrls|null
     */
    public $tracking_urls;

}
