<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OptimizationGoalMetadataScrollupGoalMetadata
{
    /**
     * @DTA\Data(field="scrollup_goal_value_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[0-9]+$/"})
     */
    public ?string $scrollup_goal_value_in_micro_currency = null;

}
