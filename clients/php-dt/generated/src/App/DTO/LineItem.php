<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LineItem
{
    /**
     * Product brand. For example, \&quot;Parker\&quot;.
     * @DTA\Data(field="product_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_brand = null;

    /**
     * Product category. For example, \&quot;Shoes\&quot;.
     * @DTA\Data(field="product_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_category = null;

    /**
     * Product ID. For example, 1414.
     * @DTA\Data(field="product_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $product_id = null;

    /**
     * Product name. For example, \&quot;Parker Boots\&quot;.
     * @DTA\Data(field="product_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_name = null;

    /**
     * Product price. For example, \&quot;99.99\&quot;.
     * @DTA\Data(field="product_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_price = null;

    /**
     * Product quantity. For example, 2.
     * @DTA\Data(field="product_quantity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $product_quantity = null;

    /**
     * Product variant. For example, \&quot;Red\&quot;.
     * @DTA\Data(field="product_variant", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_variant = null;

    /**
     * Product variant ID. For example, \&quot;1414-34832\&quot;.
     * @DTA\Data(field="product_variant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $product_variant_id = null;

}
