<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */
class TrendingKeywordDemographics
{
    /**
     * @DTA\Data(field="age_distribution", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrendsAgeDistribution::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrendsAgeDistribution::class})
     */
    public ?\App\DTO\TrendsAgeDistribution $age_distribution = null;

    /**
     * @DTA\Data(field="gender_distribution", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrendsGenderDistribution::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrendsGenderDistribution::class})
     */
    public ?\App\DTO\TrendsGenderDistribution $gender_distribution = null;

}
