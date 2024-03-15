<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TopPinsAnalyticsResponseDateAvailability
{
    /**
     * @DTA\Data(field="latest_available_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $latest_available_timestamp;

    /**
     * @DTA\Data(field="is_realtime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_realtime;

}
