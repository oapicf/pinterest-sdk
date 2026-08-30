<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The &#x60;HOUR&#x60; enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 */
class Granularity
{
}
