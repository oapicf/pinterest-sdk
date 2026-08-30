package org.openapitools.server.api;

import org.openapitools.server.model.AdsCreditRedeem;
import org.openapitools.server.model.AdsCreditRedeemCreate;
import org.openapitools.server.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.server.model.BillingInvoiceDocumentType;
import org.openapitools.server.model.BillingInvoiceDownloadResponse;
import org.openapitools.server.model.BillingInvoiceSortField;
import org.openapitools.server.model.BillingInvoiceStatus;
import org.openapitools.server.model.BillingInvoicesGet200Response;
import org.openapitools.server.model.BillingProfilesGet200Response;
import java.util.HexFormat;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import org.openapitools.server.model.SSIOAccount;
import org.openapitools.server.model.SSIOInsertionOrder;
import org.openapitools.server.model.SSIOInsertionOrderCreate;
import org.openapitools.server.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.server.model.SSIOInsertionOrderUpdate;
import org.openapitools.server.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.server.model.SsioOrderLinesGetByAdAccount200Response;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BillingServiceImpl implements BillingService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void adsCreditRedeem(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void adsCreditsDiscountsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void billingInvoiceDownloadGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void billingInvoicesGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void billingProfilesGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioAccountsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioInsertionOrderCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioInsertionOrderEdit(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioInsertionOrdersStatusGetByAdAccount(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioInsertionOrdersStatusGetByPinOrderId(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void ssioOrderLinesGetByAdAccount(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BillingService is down. Goodbye!");
    }

}
