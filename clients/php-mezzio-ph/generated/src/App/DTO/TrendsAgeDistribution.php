<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
class TrendsAgeDistribution
{
    /**
     * @DTA\Data(field="age_distribution", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrendsAgeBucket::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrendsAgeBucket::class})
     * @var \App\DTO\TrendsAgeBucket|null
     */
    public $age_distribution;

}
