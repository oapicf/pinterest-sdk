<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdGroupUpdateRequest
{
    /**
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
     * @DTA\Data(field="bid_multiplier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":10})
     */
    public ?float $bid_multiplier = null;

    /**
     * Ad group ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * &lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;
     * @DTA\Data(field="targeting_spec_operations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $targeting_spec_operations = null;

    /**
     * Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $auto_targeting_enabled = null;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bid_in_micro_currency = null;

    /**
     * @DTA\Data(field="bid_strategy_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidStrategyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidStrategyType::class})
     */
    public ?\App\DTO\BidStrategyType $bid_strategy_type = null;

    /**
     * @DTA\Data(field="billable_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     */
    public ?\App\DTO\ActionType $billable_event = null;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $budget_in_micro_currency = null;

    /**
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetType::class})
     */
    public ?\App\DTO\BudgetType $budget_type = null;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $campaign_id = null;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
     * @DTA\Data(field="is_creative_optimization", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_creative_optimization = null;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_frequency_cap = null;

    /**
     * Ad group name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $optimization_goal_metadata = null;

    /**
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PacingDeliveryType::class})
     */
    public ?\App\DTO\PacingDeliveryType $pacing_delivery_type = null;

    /**
     * &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementGroupType::class})
     */
    public ?\App\DTO\PlacementGroupType $placement_group = null;

    /**
     * Specify if the promotion is applied at ad group or item level
     * @DTA\Data(field="promotion_application_level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promotion_application_level = null;

    /**
     * Promotion ID. To clear this field, set to null.
     * @DTA\Data(field="promotion_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $promotion_id = null;

    /**
     * Promotion IDs list. To clear this field, set to an empty array [].
     * @DTA\Data(field="promotion_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $promotion_ids = null;

    /**
     * Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingSpec::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingSpec::class})
     */
    public ?\App\DTO\TargetingSpec $targeting_spec = null;

    /**
     * Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].
     * @DTA\Data(field="targeting_template_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $targeting_template_ids = null;

    /**
     * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $tracking_urls = null;

}
