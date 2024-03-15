<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountCreateSubscriptionResponse
{
    /**
     * Subscription ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Base64 encoded key for client to decrypt lead data.
     * @DTA\Data(field="cryptographic_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_key = null;

    /**
     * Lead data encryption algorithm.
     * @DTA\Data(field="cryptographic_algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_algorithm = null;

    /**
     * Subscription creation time. Unix timestamp in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

}
