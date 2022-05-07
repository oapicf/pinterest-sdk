<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedIngestionInfo
{
    /**
     * @DTA\Data(field="in_stock", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $in_stock;

    /**
     * @DTA\Data(field="out_of_stock", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $out_of_stock;

    /**
     * @DTA\Data(field="preorder", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $preorder;

}
