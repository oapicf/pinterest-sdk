<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */
class MediaUploadAllOfUploadParameters
{
    /**
     * @DTA\Data(field="x-amz-date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $x_amz_date = null;

    /**
     * @DTA\Data(field="x-amz-signature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $x_amz_signature = null;

    /**
     * @DTA\Data(field="x-amz-security-token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $x_amz_security_token = null;

    /**
     * @DTA\Data(field="x-amz-algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $x_amz_algorithm = null;

    /**
     * @DTA\Data(field="key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $key = null;

    /**
     * @DTA\Data(field="policy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $policy = null;

    /**
     * @DTA\Data(field="x-amz-credential", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $x_amz_credential = null;

    /**
     * @DTA\Data(field="Content-Type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content_type = null;

}
