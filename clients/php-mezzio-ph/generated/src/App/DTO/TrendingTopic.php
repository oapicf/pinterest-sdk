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
     * @var string|null
     */
    public $description;

    /**
     * Unique identifier for the trending topic
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Month-over-month growth percentage
     * @DTA\Data(field="percent_growth_mom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $percent_growth_mom;

    /**
     * Array of pin images related to this trend (up to 6)
     * @DTA\Data(field="pins")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection484::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection484::class})
     * @var \App\DTO\Collection484|null
     */
    public $pins;

    /**
     * List of related interest categories
     * @DTA\Data(field="related_interests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection485::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection485::class})
     * @var \App\DTO\Collection485|null
     */
    public $related_interests;

    /**
     * List of related search terms
     * @DTA\Data(field="related_searches")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection486::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection486::class})
     * @var \App\DTO\Collection486|null
     */
    public $related_searches;

    /**
     * Time series data showing trend values over time, with dates as keys and values as numeric
     * @DTA\Data(field="time_series")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection487::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection487::class})
     * @var \App\DTO\Collection487|null
     */
    public $time_series;

    /**
     * Title of the trending topic
     * @DTA\Data(field="title")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

}
