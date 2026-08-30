<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class S3MultipartUploadData
{
    /**
     * Array of file parts with pre-signed URLs.
     * @DTA\Data(field="file_parts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\S3FilePart[]|null
     */
    public $file_parts;

}
