<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of events (one or more) encapsulated by a data object.
 */
class ConversionEvents
{
    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection110::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection110::class})
     */
    public ?\App\DTO\Collection110 $data = null;

}
