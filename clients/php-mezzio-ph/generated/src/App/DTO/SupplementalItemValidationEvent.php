<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Item validation event
 */
class SupplementalItemValidationEvent
{
    /**
     * The item attribute referenced by the validation event eg. price, availability, ad_link
     * @DTA\Data(field="attribute")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $attribute;

    /**
     * The event code that the item validation event references
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $code;

    /**
     * Title message describing the item validation event
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
