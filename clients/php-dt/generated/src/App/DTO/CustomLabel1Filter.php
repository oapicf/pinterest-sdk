<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomLabel1Filter
{
    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_1 = null;

}
