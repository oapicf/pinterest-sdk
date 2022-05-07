<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupResponse
{
    /**
     * Ad group name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Ad group/entity status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":EntityStatus::class})
     * @var EntityStatus|null
     */
    public $status;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     * @DTA\Data(field="budget_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $budget_in_micro_currency;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     * @DTA\Data(field="bid_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bid_in_micro_currency;

    /**
     * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
     * @DTA\Data(field="budget_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $budget_type;

    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * Ad group end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;
     * @DTA\Data(field="targeting_spec", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var array&lt;string,string[]&gt;|null
     */
    public $targeting_spec;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     * @DTA\Data(field="lifetime_frequency_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_frequency_cap;

    /**
     * Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":TrackingUrls::class})
     * @var TrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
     * @DTA\Data(field="auto_targeting_enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $auto_targeting_enabled;

    /**
     * &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.
     * @DTA\Data(field="placement_group", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PlacementGroupType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PlacementGroupType::class})
     * @var PlacementGroupType|null
     */
    public $placement_group;

    /**
     * Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
     * @DTA\Data(field="pacing_delivery_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PacingDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PacingDeliveryType::class})
     * @var PacingDeliveryType|null
     */
    public $pacing_delivery_type;

    /**
     * oCPM learn mode
     * @DTA\Data(field="conversion_learning_mode_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $conversion_learning_mode_type;

    /**
     * Ad group summary status.
     * @DTA\Data(field="summary_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":AdGroupSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":AdGroupSummaryStatus::class})
     * @var AdGroupSummaryStatus|null
     */
    public $summary_status;

    /**
     * Feed Profile ID associated to the adgroup.
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $feed_profile_id;

    /**
     * Campaign ID of the ad group.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * @DTA\Data(field="billable_event", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     * @var \App\DTO\ActionType|null
     */
    public $billable_event;

    /**
     * Ad group ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Always \&quot;adgroup\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Advertiser ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Ad group creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Ad group last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
