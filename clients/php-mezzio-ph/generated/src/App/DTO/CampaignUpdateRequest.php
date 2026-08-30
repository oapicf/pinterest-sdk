<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CampaignUpdateRequest
{
    /**
     * @DTA\Data(field="bid_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     * @var \App\DTO\CampaignBidOptionsUpdate|null
     */
    public $bid_options;

    /**
     * @DTA\Data(field="intended_promotion_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntendedPromotionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntendedPromotionType::class})
     * @var \App\DTO\IntendedPromotionType|null
     */
    public $intended_promotion_type;

    /**
     * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @DTA\Data(field="is_ltv_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_ltv_optimized;

    /**
     * Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.
     * @DTA\Data(field="is_performance_plus", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_performance_plus;

    /**
     * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @DTA\Data(field="is_top_of_search", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_top_of_search;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ObjectiveType::class})
     * @var \App\DTO\ObjectiveType|null
     */
    public $objective_type;

    /**
     * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
     * @DTA\Data(field="daily_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $daily_spend_cap;

    /**
     * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
     * @DTA\Data(field="default_ad_group_budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $default_ad_group_budget_in_micro_currency;

    /**
     * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * Campaign ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
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
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
     * @DTA\Data(field="lifetime_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_spend_cap;

    /**
     * Campaign name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Order line ID that appears on the invoice.
     * @DTA\Data(field="order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $order_line_id;

    /**
     * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
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
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $tracking_urls;

}
