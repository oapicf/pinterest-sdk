<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LineItem
{
    /**
     * Product brand. For example, \&quot;Parker\&quot;.
     * @DTA\Data(field="product_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_brand;

    /**
     * Product category. For example, \&quot;Shoes\&quot;.
     * @DTA\Data(field="product_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_category;

    /**
     * Product ID. For example, 1414.
     * @DTA\Data(field="product_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_id;

    /**
     * Product name. For example, \&quot;Parker Boots\&quot;.
     * @DTA\Data(field="product_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_name;

    /**
     * Product price. For example, \&quot;99.99\&quot;.
     * @DTA\Data(field="product_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_price;

    /**
     * Product quantity. For example, 2.
     * @DTA\Data(field="product_quantity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_quantity;

    /**
     * Product variant. For example, \&quot;Red\&quot;.
     * @DTA\Data(field="product_variant", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_variant;

    /**
     * Product variant ID. For example, \&quot;1414-34832\&quot;.
     * @DTA\Data(field="product_variant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_variant_id;

}
