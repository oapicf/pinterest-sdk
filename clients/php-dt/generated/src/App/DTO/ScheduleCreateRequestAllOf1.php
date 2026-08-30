<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ScheduleCreateRequestAllOf1
{
    /**
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $entity_id = null;

    /**
     * Entity type
     * @DTA\Data(field="entity_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entity_type = null;

}
