<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for interest_targeting_options/get
 */
class InterestTargetingOptionsGetParameterData
{
    /**
     * Unique identifier of an interest.
     * @DTA\Data(subset="path", field="interest_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"max":18})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $interest_id = null;

}
