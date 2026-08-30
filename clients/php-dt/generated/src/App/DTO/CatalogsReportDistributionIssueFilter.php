<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsReportDistributionIssueFilter
{
    /**
     * Unique identifier of a catalog. If not given, oldest catalog will be used
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * @DTA\Data(field="report_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $report_type = null;

}
