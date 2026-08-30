<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Base64-encoded image media source
 */
class BrandAccountProfileImage
{
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

}
