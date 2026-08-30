<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsCreativeAssetsProduct
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="metadata")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsCreativeAssetsProductMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsCreativeAssetsProductMetadata::class})
     */
    public ?\App\DTO\CatalogsCreativeAssetsProductMetadata $metadata = null;

    /**
     * @DTA\Data(field="pin")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Pin::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Pin::class})
     */
    public ?\App\DTO\Pin $pin = null;

}
