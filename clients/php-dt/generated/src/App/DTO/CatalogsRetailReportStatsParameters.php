<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for retail report
 */
class CatalogsRetailReportStatsParameters
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $catalog_type = null;

    /**
     * @DTA\Data(field="report")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsRetailReportStatsParametersReport::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsRetailReportStatsParametersReport::class})
     */
    public ?\App\DTO\CatalogsRetailReportStatsParametersReport $report = null;

}
