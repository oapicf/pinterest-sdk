<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SchedulesCreate200ResponseInnerDataOneOf
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Schedule ID.
     * @DTA\Data(field="schedule_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $schedule_id;

    /**
     * @DTA\Data(field="exceptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinterestLibError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinterestLibError::class})
     * @var \App\DTO\PinterestLibError|null
     */
    public $exceptions;

}
