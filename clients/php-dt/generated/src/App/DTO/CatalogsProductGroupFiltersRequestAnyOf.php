<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsProductGroupFiltersRequestAnyOf
{
    /**
     * @DTA\Data(field="any_of")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $any_of = null;

}
