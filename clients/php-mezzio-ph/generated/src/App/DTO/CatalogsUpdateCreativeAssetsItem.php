<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A creative assets item to be updated.
 */
class CatalogsUpdateCreativeAssetsItem
{
    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsUpdatableCreativeAssetsAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsUpdatableCreativeAssetsAttributes::class})
     * @var \App\DTO\CatalogsUpdatableCreativeAssetsAttributes|null
     */
    public $attributes;

    /**
     * The catalog creative assets item id in the merchant namespace
     * @DTA\Data(field="creative_assets_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $creative_assets_id;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $operation;

}
