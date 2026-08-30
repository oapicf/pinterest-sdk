<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TopVideoPinsAnalyticsResponse
{
    /**
     * @DTA\Data(field="date_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopVideoPinsAnalyticsResponseDateAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopVideoPinsAnalyticsResponseDateAvailability::class})
     */
    public ?\App\DTO\TopVideoPinsAnalyticsResponseDateAvailability $date_availability = null;

    /**
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection502::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection502::class})
     */
    public ?\App\DTO\Collection502 $pins = null;

    /**
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopVideoPinsSortBy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopVideoPinsSortBy::class})
     */
    public ?\App\DTO\TopVideoPinsSortBy $sort_by = null;

}
