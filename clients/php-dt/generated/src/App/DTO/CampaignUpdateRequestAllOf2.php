<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CampaignUpdateRequestAllOf2
{
    /**
     * @DTA\Data(field="bid_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignBidOptionsUpdate::class})
     */
    public ?\App\DTO\CampaignBidOptionsUpdate $bid_options = null;

    /**
     * @DTA\Data(field="intended_promotion_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntendedPromotionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntendedPromotionType::class})
     */
    public ?\App\DTO\IntendedPromotionType $intended_promotion_type = null;

    /**
     * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
     * @DTA\Data(field="is_ltv_optimized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_ltv_optimized = null;

    /**
     * Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.
     * @DTA\Data(field="is_performance_plus", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_performance_plus = null;

    /**
     * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
     * @DTA\Data(field="is_top_of_search", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_top_of_search = null;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ObjectiveType::class})
     */
    public ?\App\DTO\ObjectiveType $objective_type = null;

}
