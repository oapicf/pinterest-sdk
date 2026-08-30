<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for bulkRequestGet
 */
class BulkRequestGetQueryData
{
    /**
     * If set to True then attach the errors/details to all the requests
     * @DTA\Data(field="include_details", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $include_details;

}
