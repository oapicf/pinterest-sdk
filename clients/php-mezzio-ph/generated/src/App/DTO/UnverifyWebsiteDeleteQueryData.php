<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for unverify_website/delete
 */
class UnverifyWebsiteDeleteQueryData
{
    /**
     * Website with path or domain only
     * @DTA\Data(field="website")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $website;

}
