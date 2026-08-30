<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for unverifyWebsiteDelete
 */
class UnverifyWebsiteDeleteParameterData
{
    /**
     * Website with path or domain only
     * @DTA\Data(subset="query", field="website")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $website = null;

}
