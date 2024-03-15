<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/resources/targeting/{targeting_type:APPTYPE|GENDER|LOCALE|AGE_BUCKET|LOCATION|GEO|INTEREST|KEYWORD|AUDIENCE_INCLUDE|AUDIENCE_EXCLUDE}")
 */
class ResourcesTargetingTargetingType
{
    /**
     * Get targeting options
     * @PHA\Get()
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={
     *     "type":\App\DTO\TargetingOptionsGetQueryData::class,
     *     "objectAttr":"queryData",
     *     "source": PHAttribute\Transfer::SOURCE_GET
     * })
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\Collection155
     */
    public function targetingOptionsGet(ServerRequestInterface $request): \App\DTO\Collection155
    {
        //TODO implement method
        /** @var \App\DTO\TargetingOptionsGetQueryData $queryData */
        $queryData = $request->getAttribute("queryData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
