<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SchedulesCreate200ResponseInner
{
    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SchedulesCreate200ResponseInnerData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SchedulesCreate200ResponseInnerData::class})
     */
    public ?\App\DTO\SchedulesCreate200ResponseInnerData $data = null;

}
