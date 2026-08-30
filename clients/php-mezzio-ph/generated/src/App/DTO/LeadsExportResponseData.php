<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadsExportResponseData
{
    /**
     * @DTA\Data(field="download_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $download_url;

    /**
     * @DTA\Data(field="export_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadsExportStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadsExportStatus::class})
     * @var \App\DTO\LeadsExportStatus|null
     */
    public $export_status;

}
