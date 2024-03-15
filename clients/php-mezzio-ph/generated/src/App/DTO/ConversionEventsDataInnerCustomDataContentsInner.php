<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ConversionEventsDataInnerCustomDataContentsInner
{
    /**
     * The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="item_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_price;

    /**
     * The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).
     * @DTA\Data(field="quantity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $quantity;

    /**
     * The name of a product.
     * @DTA\Data(field="item_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_name;

    /**
     * The category of a product.
     * @DTA\Data(field="item_category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_category;

    /**
     * The brand of a product.
     * @DTA\Data(field="item_brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_brand;

}
