<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadsExportResponseData
{
    /**
     * @DTA\Data(field="download_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $download_url = null;

    /**
     * @DTA\Data(field="export_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LeadsExportStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LeadsExportStatus::class})
     */
    public ?\App\DTO\LeadsExportStatus $export_status = null;

}
