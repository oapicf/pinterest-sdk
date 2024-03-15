<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
class CatalogsFeedProcessingSchedule
{
    /**
     * A time in format HH:MM with leading 0 (zero)
     * @DTA\Data(field="time")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$/"})
     * @var string|null
     */
    public $time;

    /**
     * The timezone considered for the processing schedule time.
     * @DTA\Data(field="timezone")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $timezone;

}
