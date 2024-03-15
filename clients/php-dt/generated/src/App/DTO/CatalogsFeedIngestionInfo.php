<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsFeedIngestionInfo
{
    /**
     * The number of ingested products that are in stock.
     * @DTA\Data(field="IN_STOCK", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $in_stock = null;

    /**
     * The number of ingested products that are in out of stock.
     * @DTA\Data(field="OUT_OF_STOCK", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $out_of_stock = null;

    /**
     * The number of ingested products that are in preorder.
     * @DTA\Data(field="PREORDER", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $preorder = null;

}
