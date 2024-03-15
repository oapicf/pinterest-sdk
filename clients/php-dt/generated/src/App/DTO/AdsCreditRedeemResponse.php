<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsCreditRedeemResponse
{
    /**
     * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
     * @DTA\Data(field="success", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $success = null;

    /**
     * Error code type if error occurs
     * @DTA\Data(field="errorCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $error_code = null;

    /**
     * Reason for failure
     * @DTA\Data(field="errorMessage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error_message = null;

}
