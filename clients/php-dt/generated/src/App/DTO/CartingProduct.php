<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CartingProduct
{
    /**
     * the internal Pinterest carting product id (different from industry product id)
     * @DTA\Data(field="carting_product_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $carting_product_id = null;

    /**
     * Whether to display only the preferred retailers for the carting product
     * @DTA\Data(field="display_preferred_retailers_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $display_preferred_retailers_only = null;

    /**
     * Whether to display the price for the carting product
     * @DTA\Data(field="display_product_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $display_product_price = null;

    /**
     * A sorted array of preferred retailers for the carting product
     * @DTA\Data(field="preferred_retailers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $preferred_retailers = null;

    /**
     * Whether to randomize preferred retailers for the carting product
     * @DTA\Data(field="randomize_preferred_retailers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $randomize_preferred_retailers = null;

}
