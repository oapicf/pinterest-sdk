<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomLabel2Filter
{
    /**
     * @DTA\Data(field="CUSTOM_LABEL_2")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @var \App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria|null
     */
    public $custom_label_2;

}
