<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A creative assets item to be deleted
 */
class CatalogsDeleteCreativeAssetsItem
{
    /**
     * The catalog creative assets id in the merchant namespace
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
