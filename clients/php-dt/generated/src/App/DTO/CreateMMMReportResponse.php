<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateMMMReportResponse
{
    /**
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $code = null;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateMMMReportResponseData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateMMMReportResponseData::class})
     */
    public ?\App\DTO\CreateMMMReportResponseData $data = null;

}
