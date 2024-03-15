<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TopPinsAnalyticsResponseDateAvailability
{
    /**
     * @DTA\Data(field="latest_available_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latest_available_timestamp = null;

    /**
     * @DTA\Data(field="is_realtime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_realtime = null;

}
