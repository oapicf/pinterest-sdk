<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class AppsflyerAudienceSyncCreate
{
    /**
     * The container ID of the audience
     * @DTA\Data(field="container_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $container_id;

    /**
     * The pre-signed URL for SHA256 hashed GAID/IDFA file
     * @DTA\Data(field="url_adid_sha256", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url_adid_sha256;

    /**
     * The pre-signed URL for SHA256 hashed email file
     * @DTA\Data(field="url_email_sha256", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url_email_sha256;

}
