<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Campaign Data
 */
class CampaignCommon
{
    /**
     * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Campaign name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
     * @DTA\Data(field="lifetime_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_spend_cap;

    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
     * @DTA\Data(field="daily_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $daily_spend_cap;

    /**
     * Order line ID that appears on the invoice.
     * @DTA\Data(field="order_line_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $order_line_id;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     * @var \App\DTO\AdCommonTrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * @DTA\Data(field="summary_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSummaryStatus::class})
     * @var \App\DTO\CampaignSummaryStatus|null
     */
    public $summary_status;

}
