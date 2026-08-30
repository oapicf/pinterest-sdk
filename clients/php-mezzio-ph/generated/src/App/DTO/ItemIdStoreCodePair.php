<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */
class ItemIdStoreCodePair
{
    /**
     * Catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * Store code for the local inventory item
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_code;

}
