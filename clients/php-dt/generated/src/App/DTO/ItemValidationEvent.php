<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item validation event
 */
class ItemValidationEvent
{
    /**
     * The attribute that the item validation event references
     * @DTA\Data(field="attribute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $attribute = null;

    /**
     * The event code that the item validation event references
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * Title message describing the item validation event
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
