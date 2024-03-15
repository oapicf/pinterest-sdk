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
     * @var string|null
     */
    public $organic_pin_id;

    /**
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $android_deep_link;

    /**
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ios_deep_link;

    /**
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $destination_url;

    /**
     * @DTA\Data(field="result_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $result_id;

}
