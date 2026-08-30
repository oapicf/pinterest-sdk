<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ScheduleUpdateRequestAllOf1
{
    /**
     * @DTA\Data(field="entity_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $entity_id = null;

    /**
     * Entity type
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entity_type = null;

    /**
     * Schedule ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

}
