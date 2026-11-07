package org.openapitools.api;

import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.PinterestLibError;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for CustomerListUploadsApi
 */
@MicronautTest
public class CustomerListUploadsApiTest {

    @Inject
    CustomerListUploadsApi api;

    
    /**
     * Create customer list upload
     *
     * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListUploadsCreateTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        CustomerListUploadCreateRequest customerListUploadCreateRequest = new CustomerListUploadCreateRequest(org.openapitools.model.UserListOperationType.fromValue("ADD"), 2);

        // when
        CustomerListUploadCreateResponse body = api.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest).block();

        // then
        // TODO implement the customerListUploadsCreateTest()
    }

    
    /**
     * Get customer list upload
     *
     * Get the metadata for a given upload by its ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListUploadsGetTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        String customerListUploadId = "example";

        // when
        CustomerListUpload body = api.customerListUploadsGet(adAccountId, customerListId, customerListUploadId).block();

        // then
        // TODO implement the customerListUploadsGetTest()
    }

    
    /**
     * Run customer list upload
     *
     * Begin processing a customer list upload.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListUploadsRunTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        String customerListUploadId = "example";

        // when
        CustomerListUpload body = api.customerListUploadsRun(adAccountId, customerListId, customerListUploadId).block();

        // then
        // TODO implement the customerListUploadsRunTest()
    }

    
}
