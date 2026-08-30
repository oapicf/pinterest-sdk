<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
class TrendsGenderDistribution
{
    /**
     * @DTA\Data(field="gender_distribution", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrendsGender::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrendsGender::class})
     * @var \App\DTO\TrendsGender|null
     */
    public $gender_distribution;

}
