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
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $in_stock = null;

    /**
     * @DTA\Data(field="out_of_stock")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $out_of_stock = null;

    /**
     * @DTA\Data(field="preorder")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $preorder = null;

    /**
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $total = null;

}
