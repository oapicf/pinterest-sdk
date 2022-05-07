<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomLabel1Filter
{
    /**
     * @DTA\Data(field="CUSTOM_LABEL_1")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $custom_label_1;

}
