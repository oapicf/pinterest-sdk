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
 * @PHA\Route(pattern="/businesses/{business_id:/^\\d+$/}/partners/assets")
 */
class BusinessesBusinessIdPartnersAssets
{
    /**
     * Delete partner access to asset
     * @PHA\Delete()
     * TODO check if consumer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Consumer(name=PHConsumer\Json::class, mediaRange="application/json")
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={"type":\App\DTO\DeletePartnerAssetAccessBody::class,"objectAttr":"bodyData"})
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\DeletePartnerAssetAccessResultsResponseArray
     */
    public function deletePartnerAssetAccessHandlerImpl(ServerRequestInterface $request): \App\DTO\DeletePartnerAssetAccessResultsResponseArray
    {
        //TODO implement method
        /** @var \App\DTO\DeletePartnerAssetAccessBody $bodyData */
        $bodyData = $request->getAttribute("bodyData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Assign/Update partner asset permissions
     * @PHA\Patch()
     * TODO check if consumer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Consumer(name=PHConsumer\Json::class, mediaRange="application/json")
     * @PHA\Attribute(name=PHAttribute\Transfer::class, options={"type":\App\DTO\UpdatePartnerAssetAccessBody::class,"objectAttr":"bodyData"})
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\UpdatePartnerAssetsResultsResponseArray
     */
    public function updatePartnerAssetAccessHandlerImpl(ServerRequestInterface $request): \App\DTO\UpdatePartnerAssetsResultsResponseArray
    {
        //TODO implement method
        /** @var \App\DTO\UpdatePartnerAssetAccessBody $bodyData */
        $bodyData = $request->getAttribute("bodyData");
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
