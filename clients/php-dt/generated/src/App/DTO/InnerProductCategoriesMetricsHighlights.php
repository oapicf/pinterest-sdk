<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class InnerProductCategoriesMetricsHighlights
{
    /**
     * Month-over-month percentage change
     * @DTA\Data(field="pct_change_mom")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $pct_change_mom = null;

}
