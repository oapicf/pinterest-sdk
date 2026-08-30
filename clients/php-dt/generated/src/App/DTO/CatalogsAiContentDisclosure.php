<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * AI content disclosure for a single asset of a catalog item.
 */
class CatalogsAiContentDisclosure
{
    /**
     * Disclosure labels that apply to this asset.
     * @DTA\Data(field="disclosure")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $disclosure = null;

    /**
     * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2000})
     */
    public ?string $url = null;

}
