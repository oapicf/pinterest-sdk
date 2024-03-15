<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Product counts for a CatalogsProductGroup
 */
class CatalogsProductGroupProductCounts
{
    /**
     * @DTA\Data(field="in_stock")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $in_stock;

    /**
     * @DTA\Data(field="out_of_stock")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $out_of_stock;

    /**
     * @DTA\Data(field="preorder")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $preorder;

    /**
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $total;

}
