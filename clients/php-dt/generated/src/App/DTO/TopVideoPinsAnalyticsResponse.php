<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TopVideoPinsAnalyticsResponse
{
    /**
     * @DTA\Data(field="date_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TopPinsAnalyticsResponseDateAvailability::class})
     */
    public ?\App\DTO\TopPinsAnalyticsResponseDateAvailability $date_availability = null;

    /**
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     */
    public ?\App\DTO\Collection176 $pins = null;

    /**
     * @DTA\Data(field="sort_by", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sort_by = null;

}
