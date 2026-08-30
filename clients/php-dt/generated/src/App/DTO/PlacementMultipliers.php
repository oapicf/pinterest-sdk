<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
class PlacementMultipliers
{
    /**
     * Placement type identifier.
     * @DTA\Data(field="PLACEMENT", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementType::class})
     */
    public ?\App\DTO\PlacementType $placement = null;

}
