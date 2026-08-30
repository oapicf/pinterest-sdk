<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class S3FilePart
{
    /**
     * Part number for upload.
     * @DTA\Data(field="part_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $part_number = null;

    /**
     * Pre-signed URL.
     * @DTA\Data(field="presigned_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $presigned_url = null;

}
