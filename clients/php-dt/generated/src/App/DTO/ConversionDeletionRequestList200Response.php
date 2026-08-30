<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ConversionDeletionRequestList200Response
{
    /**
     * @DTA\Data(field="bookmark", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $bookmark = null;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection171::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection171::class})
     */
    public ?\App\DTO\Collection171 $items = null;

}
