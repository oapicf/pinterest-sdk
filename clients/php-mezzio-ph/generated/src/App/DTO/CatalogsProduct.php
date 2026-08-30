<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProduct
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * @DTA\Data(field="metadata")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsCreativeAssetsProductMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsCreativeAssetsProductMetadata::class})
     * @var \App\DTO\CatalogsCreativeAssetsProductMetadata|null
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
