<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Creative assets product metadata entity
 */
class CatalogsCreativeAssetsProductMetadata
{
    /**
     * The user-created unique ID that represents the creative assets item.
     * @DTA\Data(field="creative_assets_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $creative_assets_id = null;

    /**
     * @DTA\Data(field="visibility")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeAssetsVisibilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeAssetsVisibilityType::class})
     */
    public ?\App\DTO\CreativeAssetsVisibilityType $visibility = null;

}
