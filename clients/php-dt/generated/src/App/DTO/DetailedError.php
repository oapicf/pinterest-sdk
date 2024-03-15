<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Used for including extra details to a base error
 */
class DetailedError
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * @DTA\Data(field="details")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $details = null;

}
