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
 * @PHA\Route(pattern="/ad_accounts/{ad_account_id:/^\\d+$/}/conversion_deletion_requests/{request_id:/^\\d+$/}")
 */
class AdAccountsAdAccountIdConversionDeletionRequestsRequestId
{
    /**
     * Delete a conversion deletion request
     * @PHA\Delete()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ConversionDeletionRequest
     */
    public function conversionDeletionRequestDelete(ServerRequestInterface $request): \App\DTO\ConversionDeletionRequest
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Get a single conversion deletion request
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ConversionDeletionRequest
     */
    public function conversionDeletionRequestGet(ServerRequestInterface $request): \App\DTO\ConversionDeletionRequest
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
