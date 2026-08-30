<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TopVideoPinsAnalyticsResponse
{
    /**
     * @DTA\Data(field="date_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopVideoPinsAnalyticsResponseDateAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopVideoPinsAnalyticsResponseDateAvailability::class})
     * @var \App\DTO\TopVideoPinsAnalyticsResponseDateAvailability|null
     */
    public $date_availability;

    /**
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection502::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection502::class})
     * @var \App\DTO\Collection502|null
     */
    public $pins;

    /**
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopVideoPinsSortBy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopVideoPinsSortBy::class})
     * @var \App\DTO\TopVideoPinsSortBy|null
     */
    public $sort_by;

}
