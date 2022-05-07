<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object holding a group of filters for a catalog product group
 */
class CatalogsProductGroupFilters
{
    /**
     * @DTA\Data(field="any_of", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsProductGroupFilterKeys[]|null
     */
    public $any_of;

    /**
     * @DTA\Data(field="all_of", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsProductGroupFilterKeys[]|null
     */
    public $all_of;

}
