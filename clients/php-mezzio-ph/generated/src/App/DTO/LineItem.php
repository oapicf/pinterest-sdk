<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LineItem
{
    /**
     * Product brand. For example, &#39;Parker&#39;.
     * @DTA\Data(field="product_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_brand;

    /**
     * Product category. For example, &#39;Shoes&#39;.
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
     * Product name. For example, &#39;Parker Boots&#39;.
     * @DTA\Data(field="product_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_name;

    /**
     * Product price. For example, &#39;99.99&#39;.
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
     * Product variant. For example, &#39;Red&#39;.
     * @DTA\Data(field="product_variant", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_variant;

    /**
     * Product variant ID. For example, &#39;1414-34832&#39;.
     * @DTA\Data(field="product_variant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $product_variant_id;

}
