<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TopPinsAnalyticsResponse
{
    /**
     * @DTA\Data(field="date_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     * @var \App\DTO\TopPinsAnalyticsResponseDateAvailability|null
     */
    public $date_availability;

    /**
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection498::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection498::class})
     * @var \App\DTO\Collection498|null
     */
    public $pins;

    /**
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopPinsSortBy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopPinsSortBy::class})
     * @var \App\DTO\TopPinsSortBy|null
     */
    public $sort_by;

}
