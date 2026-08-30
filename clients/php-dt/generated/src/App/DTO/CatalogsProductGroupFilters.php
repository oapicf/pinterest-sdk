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
     * @DTA\Data(field="any_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $any_of = null;

    /**
     * @DTA\Data(field="all_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $all_of = null;

}
