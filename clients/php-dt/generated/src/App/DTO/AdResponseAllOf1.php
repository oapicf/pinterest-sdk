<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdResponseAllOf1
{
    /**
     * The ID of the advertiser that this ad belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * ID of the ad campaign that contains this ad.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * Destination URL template for all items within a collections drawer.
     * @DTA\Data(field="collection_items_destination_url_template", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $collection_items_destination_url_template;

    /**
     * Pin creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * The ID of this ad.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejected_reasons", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $rejected_reasons;

    /**
     * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejection_labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $rejection_labels;

    /**
     * Ad review status
     * @DTA\Data(field="review_status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $review_status;

    /**
     * Always \&quot;ad\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

    /**
     * Ad summary status
     * @DTA\Data(field="summary_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PinPromotionSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PinPromotionSummaryStatus::class})
     * @var PinPromotionSummaryStatus|null
     */
    public $summary_status;

}
