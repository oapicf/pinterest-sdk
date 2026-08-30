<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerSegment
{
    /**
     * The ID of the ad account that this customer segment belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Audience IDs included in the customer segment.
     * @DTA\Data(field="audience_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection193::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection193::class})
     */
    public ?\App\DTO\Collection193 $audience_ids = null;

    /**
     * Customer segment created time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Customer segment ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Customer segment name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Indicates whether the customer segment is active or deleted.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateStatus::class})
     */
    public ?\App\DTO\TargetingTemplateStatus $status = null;

    /**
     * Customer segment updated time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
