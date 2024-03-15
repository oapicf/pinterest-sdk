<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Base64-encoded image media source
 */
class PinMediaSourceImageBase64
{
    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $source_type = null;

    /**
     * @DTA\Data(field="content_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_type = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/[a-zA-Z0-9+\/=]+/"})
     */
    public ?string $data = null;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @DTA\Data(field="is_standard", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_standard = null;

}
