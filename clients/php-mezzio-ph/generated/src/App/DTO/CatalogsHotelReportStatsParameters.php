<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for hotel report
 */
class CatalogsHotelReportStatsParameters
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $catalog_type;

    /**
     * @DTA\Data(field="report")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelReportStatsParametersReport::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelReportStatsParametersReport::class})
     * @var \App\DTO\CatalogsHotelReportStatsParametersReport|null
     */
    public $report;

}
