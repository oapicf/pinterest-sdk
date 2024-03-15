<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProductGroupAnalyticsResponseInner
{
    /**
     * The ID of the product group that this metrics belongs to.
     * @DTA\Data(field="PRODUCT_GROUP_ID")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $product_group_id;

    /**
     * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     * @DTA\Data(field="DATE", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date;

}
