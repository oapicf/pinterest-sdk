<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * If specified, you must provide all properties
 */
class CatalogsHotelGuestRatings
{
    /**
     * Your hotel&#39;s rating.
     * @DTA\Data(field="score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $score;

    /**
     * Total number of people who have rated this hotel.
     * @DTA\Data(field="number_of_reviewers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $number_of_reviewers;

    /**
     * Max value for the hotel rating score.
     * @DTA\Data(field="max_score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $max_score;

    /**
     * System you use for guest reviews.
     * @DTA\Data(field="rating_system", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $rating_system;

}
