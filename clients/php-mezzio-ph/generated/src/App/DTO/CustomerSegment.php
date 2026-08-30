<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomerSegment
{
    /**
     * The ID of the ad account that this customer segment belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Audience IDs included in the customer segment.
     * @DTA\Data(field="audience_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     * @var \App\DTO\Collection193|null
     */
    public $audience_ids;

    /**
     * Customer segment created time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Customer segment ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Customer segment name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Indicates whether the customer segment is active or deleted.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @var \App\DTO\TargetingTemplateStatus|null
     */
    public $status;

    /**
     * Customer segment updated time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
