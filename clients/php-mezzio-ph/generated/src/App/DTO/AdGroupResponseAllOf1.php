<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdGroupResponseAllOf1
{
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
