<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Individual trending topic within an interest category
 */
class TrendingTopic
{
    /**
     * Description of the trending topic
     * @DTA\Data(field="description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Unique identifier for the trending topic
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Month-over-month growth percentage
     * @DTA\Data(field="percent_growth_mom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $percent_growth_mom = null;

    /**
     * Array of pin images related to this trend (up to 6)
     * @DTA\Data(field="pins")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection484::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection484::class})
     */
    public ?\App\DTO\Collection484 $pins = null;

    /**
     * List of related interest categories
     * @DTA\Data(field="related_interests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection485::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection485::class})
     */
    public ?\App\DTO\Collection485 $related_interests = null;

    /**
     * List of related search terms
     * @DTA\Data(field="related_searches")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection486::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection486::class})
     */
    public ?\App\DTO\Collection486 $related_searches = null;

    /**
     * Time series data showing trend values over time, with dates as keys and values as numeric
     * @DTA\Data(field="time_series")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection487::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection487::class})
     */
    public ?\App\DTO\Collection487 $time_series = null;

    /**
     * Title of the trending topic
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

}
