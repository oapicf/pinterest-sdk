<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OptimizationGoalMetadataScrollupGoalMetadata
{
    /**
     * @DTA\Data(field="scrollup_goal_value_in_micro_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[0-9]+$/"})
     * @var string|null
     */
    public $scrollup_goal_value_in_micro_currency;

}
