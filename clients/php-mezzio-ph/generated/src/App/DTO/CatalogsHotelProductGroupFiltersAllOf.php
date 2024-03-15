<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsHotelProductGroupFiltersAllOf
{
    /**
     * @DTA\Data(field="all_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsHotelProductGroupFilterKeys[]|null
     */
    public $all_of;

}
