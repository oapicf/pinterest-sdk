package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdsCreditRedeem
import org.openapitools.model.AdsCreditRedeemCreate
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.BillingInvoiceDocumentType
import org.openapitools.model.BillingInvoiceDownloadResponse
import org.openapitools.model.BillingInvoiceSortField
import org.openapitools.model.BillingInvoiceStatus
import org.openapitools.model.BillingInvoicesGet200Response
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.SSIOAccount
import org.openapitools.model.SSIOInsertionOrder
import org.openapitools.model.SSIOInsertionOrderCreate
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SSIOInsertionOrderUpdate
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response

class BillingApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adsCreditRedeem ( String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads_credit/redeem"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adsCreditRedeemCreate == null) {
            throw new RuntimeException("missing required params adsCreditRedeemCreate")
        }



        contentType = 'application/json';
        bodyParams = adsCreditRedeemCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdsCreditRedeem.class )

    }

    def adsCreditsDiscountsGet ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads_credit/discounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdsCreditsDiscountsGet200Response.class )

    }

    def billingInvoiceDownloadGet ( String adAccountId, String billingInvoiceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/billing_invoice/${billing_invoice_id}/download"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (billingInvoiceId == null) {
            throw new RuntimeException("missing required params billingInvoiceId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BillingInvoiceDownloadResponse.class )

    }

    def billingInvoicesGet ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, Date startDueDate, Date endDueDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/billing_invoices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (sort != null) {
            queryParams.put("sort", sort)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (documentType != null) {
            queryParams.put("document_type", documentType)
        }
        if (startDueDate != null) {
            queryParams.put("start_due_date", startDueDate)
        }
        if (endDueDate != null) {
            queryParams.put("end_due_date", endDueDate)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BillingInvoicesGet200Response.class )

    }

    def billingProfilesGet ( Boolean isActive, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/billing_profiles"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (isActive == null) {
            throw new RuntimeException("missing required params isActive")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BillingProfilesGet200Response.class )

    }

    def ssioAccountsGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SSIOAccount.class )

    }

    def ssioInsertionOrderCreate ( String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (ssIOInsertionOrderCreate == null) {
            throw new RuntimeException("missing required params ssIOInsertionOrderCreate")
        }



        contentType = 'application/json';
        bodyParams = ssIOInsertionOrderCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SSIOInsertionOrder.class )

    }

    def ssioInsertionOrderEdit ( String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (ssIOInsertionOrderUpdate == null) {
            throw new RuntimeException("missing required params ssIOInsertionOrderUpdate")
        }



        contentType = 'application/json';
        bodyParams = ssIOInsertionOrderUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    SSIOInsertionOrder.class )

    }

    def ssioInsertionOrdersStatusGetByAdAccount ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SsioInsertionOrdersStatusGetByAdAccount200Response.class )

    }

    def ssioInsertionOrdersStatusGetByPinOrderId ( String adAccountId, String pinOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders/${pin_order_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (pinOrderId == null) {
            throw new RuntimeException("missing required params pinOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SSIOInsertionOrderStatusResponse.class )

    }

    def ssioOrderLinesGetByAdAccount ( String adAccountId, String pinOrderId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/order_lines"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (pinOrderId != null) {
            queryParams.put("pin_order_id", pinOrderId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SsioOrderLinesGetByAdAccount200Response.class )

    }

}
