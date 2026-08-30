<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object holding a group of filters for a creative assets product group
 */
class CatalogsCreativeAssetsProductGroupFilters
{
    /**
     * @DTA\Data(field="any_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsCreativeAssetsProductGroupFilterKeys[]|null
     */
    public $any_of;

    /**
     * @DTA\Data(field="all_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CatalogsCreativeAssetsProductGroupFilterKeys[]|null
     */
    public $all_of;

}
