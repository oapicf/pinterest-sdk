<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupFiltersAllOf
{
    /**
     * @DTA\Data(field="all_of", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsProductGroupFilterKeys[]|null
     */
    public $all_of;

}
