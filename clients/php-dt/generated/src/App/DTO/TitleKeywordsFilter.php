<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TitleKeywordsFilter
{
    /**
     * @DTA\Data(field="TITLE_KEYWORDS")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleStringCriteria $title_keywords = null;

}
