<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The result, and link out, based on the user’s choice.
 */
class QuizPinResult
{
    /**
     * @DTA\Data(field="organic_pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $organic_pin_id = null;

    /**
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $android_deep_link = null;

    /**
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ios_deep_link = null;

    /**
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $destination_url = null;

    /**
     * @DTA\Data(field="result_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $result_id = null;

}
