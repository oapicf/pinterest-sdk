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
     */
    public ?\App\DTO\Collection49 $categories = null;

    /**
     * @DTA\Data(field="demographics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceDemographics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceDemographics::class})
     */
    public ?\App\DTO\AudienceDemographics $demographics = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceInsightType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceInsightType::class})
     */
    public ?\App\DTO\AudienceInsightType $type = null;

    /**
     * Generation date
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $date = null;

    /**
     * Population count.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $size = null;

    /**
     * Indicates whether the audience size has been rounded up to the next highest upper boundary.
     * @DTA\Data(field="size_is_upper_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $size_is_upper_bound = null;

}
