<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PromotionTemplateValue
{
    /**
     * Numeric value.
     * @DTA\Data(field="amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $amount = null;

    /**
     * @DTA\Data(field="currency_code", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency_code = null;

    /**
     * Custom text.
     * @DTA\Data(field="custom_text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_text = null;

    /**
     * Percent value.
     * @DTA\Data(field="percent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $percent = null;

}
