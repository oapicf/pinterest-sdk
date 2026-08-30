<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Base64-encoded image media source
 */
class BrandAccountProfileImageUpdate
{
    /**
     * @DTA\Data(field="content_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content_type;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/[a-zA-Z0-9+\/=]+/"})
     * @var string|null
     */
    public $data;

}
