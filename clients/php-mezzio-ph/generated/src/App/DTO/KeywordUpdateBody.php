<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class KeywordUpdateBody
{
    /**
     * Keywords to update. Object array. Each object has 3 possible fields:&lt;br&gt;1. \&quot;id\&quot;: (required) keyword ID&lt;br&gt;2. \&quot;archived\&quot;: boolean. Should keyword be archived?&lt;br&gt;3. \&quot;bid\&quot;: number&lt;br&gt;For example: [{\&quot;id\&quot;:\&quot;2886610576653\&quot;, \&quot;archived\&quot;: false, \&quot;bid\&quot;: 20000}, {\&quot;id\&quot;:\&quot;2886610576654\&quot;,  \&quot;archived\&quot;: true, \&quot;bid\&quot;: 20000}, ...]
     * @DTA\Data(field="keywords")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection117::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection117::class})
     * @var \App\DTO\Collection117|null
     */
    public $keywords;

}
