<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CartingProduct
{
    /**
     * the internal Pinterest carting product id (different from industry product id)
     * @DTA\Data(field="carting_product_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $carting_product_id;

    /**
     * Whether to display only the preferred retailers for the carting product
     * @DTA\Data(field="display_preferred_retailers_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $display_preferred_retailers_only;

    /**
     * Whether to display the price for the carting product
     * @DTA\Data(field="display_product_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $display_product_price;

    /**
     * A sorted array of preferred retailers for the carting product
     * @DTA\Data(field="preferred_retailers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     * @var \App\DTO\Collection55|null
     */
    public $preferred_retailers;

    /**
     * Whether to randomize preferred retailers for the carting product
     * @DTA\Data(field="randomize_preferred_retailers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $randomize_preferred_retailers;

}
