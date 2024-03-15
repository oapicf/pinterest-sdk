<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An item to be deleted
 */
class CatalogsDeleteRetailItem
{
    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $operation;

}
