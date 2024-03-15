<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class KeywordsRequest
{
    /**
     * Keyword JSON array. Each array element has 3 fields
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection74::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection74::class})
     */
    public ?\App\DTO\Collection74 $keywords = null;

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     * @DTA\Data(field="parent_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^((AG)|C)?\d+$/"})
     */
    public ?string $parent_id = null;

}
