<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Report parameters
 */
class CatalogsReportParameters
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * @DTA\Data(field="report")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelReportParametersReport::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelReportParametersReport::class})
     * @var \App\DTO\CatalogsHotelReportParametersReport|null
     */
    public $report;

}
