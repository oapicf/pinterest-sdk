<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Information of the published editorial article.
 */
class TrendsEditorial
{
    /**
     * URL of the editorial board
     * @DTA\Data(field="board_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $board_url = null;

    /**
     * Description of the editorial article
     * @DTA\Data(field="description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * List of interests related to the editorial article
     * @DTA\Data(field="interests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection462::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection462::class})
     */
    public ?\App\DTO\Collection462 $interests = null;

    /**
     * URL of the pins related to the editorial article
     * @DTA\Data(field="pins_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection463::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection463::class})
     */
    public ?\App\DTO\Collection463 $pins_url = null;

    /**
     * List of keywords related to the editorial article
     * @DTA\Data(field="related_keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection464::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection464::class})
     */
    public ?\App\DTO\Collection464 $related_keywords = null;

    /**
     * Title of the editorial article
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

}
