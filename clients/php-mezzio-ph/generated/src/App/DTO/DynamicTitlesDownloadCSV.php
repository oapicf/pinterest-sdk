<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DynamicTitlesDownloadCSV
{
    /**
     * Pre-signed S3 URL to download the CSV file.
     * @DTA\Data(field="download_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $download_url;

}
