<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Audience interests and demographics.
 */
class AudienceInsightsResponse
{
    /**
     * Category interest distribution
     * @DTA\Data(field="categories", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection49::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection49::class})
     * @var \App\DTO\Collection49|null
     */
    public $categories;

    /**
     * @DTA\Data(field="demographics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceDemographics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceDemographics::class})
     * @var \App\DTO\AudienceDemographics|null
     */
    public $demographics;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceInsightType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceInsightType::class})
     * @var \App\DTO\AudienceInsightType|null
     */
    public $type;

    /**
     * Generation date
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $date;

    /**
     * Population count.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size;

    /**
     * Indicates whether the audience size has been rounded up to the next highest upper boundary.
     * @DTA\Data(field="size_is_upper_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $size_is_upper_bound;

}
