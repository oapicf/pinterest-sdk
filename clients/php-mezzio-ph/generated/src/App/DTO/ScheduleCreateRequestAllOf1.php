<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ScheduleCreateRequestAllOf1
{
    /**
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[C]?\\d+$/"})
     * @var string|null
     */
    public $entity_id;

    /**
     * Entity type
     * @DTA\Data(field="entity_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entity_type;

}
