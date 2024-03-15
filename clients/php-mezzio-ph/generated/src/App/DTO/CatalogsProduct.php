<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProduct
{
    /**
     * @DTA\Data(field="metadata")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductMetadata::class})
     * @var \App\DTO\CatalogsProductMetadata|null
     */
    public $metadata;

    /**
     * @DTA\Data(field="pin")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Pin::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Pin::class})
     * @var \App\DTO\Pin|null
     */
    public $pin;

}
