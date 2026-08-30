<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MediaTypeFilter
{
    /**
     * @DTA\Data(field="MEDIA_TYPE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleMediaTypesCriteria|null
     */
    public $media_type;

}
