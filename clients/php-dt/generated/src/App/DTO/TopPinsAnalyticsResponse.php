<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TopPinsAnalyticsResponse
{
    /**
     * @DTA\Data(field="date_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     */
    public ?\App\DTO\TopPinsAnalyticsResponseDateAvailability $date_availability = null;

    /**
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection498::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection498::class})
     */
    public ?\App\DTO\Collection498 $pins = null;

    /**
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopPinsSortBy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopPinsSortBy::class})
     */
    public ?\App\DTO\TopPinsSortBy $sort_by = null;

}
