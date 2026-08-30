<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MediaUploadParameters
{
    /**
     * @DTA\Data(field="Content-Type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_type;

    /**
     * @DTA\Data(field="key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $key;

    /**
     * @DTA\Data(field="policy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $policy;

    /**
     * @DTA\Data(field="x-amz-algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $x_amz_algorithm;

    /**
     * @DTA\Data(field="x-amz-credential", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $x_amz_credential;

    /**
     * @DTA\Data(field="x-amz-date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $x_amz_date;

    /**
     * @DTA\Data(field="x-amz-security-token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $x_amz_security_token;

    /**
     * @DTA\Data(field="x-amz-signature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $x_amz_signature;

}
