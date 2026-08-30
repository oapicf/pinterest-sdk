<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for conversionTagsList
 */
class ConversionTagsListQueryData
{
    /**
     * Filter by deleted status
     * @DTA\Data(field="filter_deleted", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $filter_deleted;

}
