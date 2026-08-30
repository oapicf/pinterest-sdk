<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DynamicTitlesUploadURL
{
    /**
     * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
     * @DTA\Data(field="existing_filename", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $existing_filename = null;

    /**
     * Unique identifier for this upload session. Must be passed to the process endpoint.
     * @DTA\Data(field="request_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $request_id = null;

    /**
     * Pre-signed S3 PUT URL to upload the reviewed CSV file.
     * @DTA\Data(field="upload_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $upload_url = null;

}
