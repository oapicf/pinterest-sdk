#include "BillingApi.h"

using namespace Tiny;



        Response<
            AdsCreditRedeem
        >
        BillingApi::
        adsCredit_redeem(
            
            std::string adAccountId
            , 
            
            AdsCreditRedeemCreate adsCreditRedeemCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads_credit/redeem"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | adsCreditRedeemCreate



            payload = adsCreditRedeemCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdsCreditRedeem obj(output_string);


            Response<AdsCreditRedeem> response(obj, httpCode);
            return response;
        }

        Response<
            Ads_credits_discounts_get_200_response
        >
        BillingApi::
        adsCreditsDiscounts_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ads_credit/discounts"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ads_credits_discounts_get_200_response obj(output_string);


            Response<Ads_credits_discounts_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            BillingInvoiceDownloadResponse
        >
        BillingApi::
        billingInvoiceDownload_get(
            
            std::string adAccountId
            , 
            
            std::string billingInvoiceId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download"; //adAccountId billingInvoiceId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_billingInvoiceId("{");
                s_billingInvoiceId.append("billing_invoice_id");
                s_billingInvoiceId.append("}");

                int pos = url.find(s_billingInvoiceId);

                url.erase(pos, s_billingInvoiceId.length());
                url.insert(pos, stringify(billingInvoiceId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BillingInvoiceDownloadResponse obj(output_string);


            Response<BillingInvoiceDownloadResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Billing_invoices_get_200_response
        >
        BillingApi::
        billingInvoices_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            BillingInvoiceSortField sort
            , 
            
            BillingInvoiceStatus status
            , 
            
            BillingInvoiceDocumentType documentType
            , 
            
            Date startDueDate
            , 
            
            Date endDueDate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/billing_invoices"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize order sort status documentType startDueDate endDueDate 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("order",order);
            addQueryParam("sort",sort);
            addQueryParam("status",status);
            addQueryParam("document_type",documentType);
            addQueryParam("start_due_date",startDueDate);
            addQueryParam("end_due_date",endDueDate);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Billing_invoices_get_200_response obj(output_string);


            Response<Billing_invoices_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Billing_profiles_get_200_response
        >
        BillingApi::
        billingProfiles_get(
            
            bool isActive
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/billing_profiles"; //adAccountId 


            // Headers  | 

            // Query    | isActive bookmark pageSize 
            addQueryParam("is_active",isActive);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Billing_profiles_get_200_response obj(output_string);


            Response<Billing_profiles_get_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOAccount
        >
        BillingApi::
        ssioAccounts_get(
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/accounts"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOAccount obj(output_string);


            Response<SSIOAccount> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOInsertionOrder
        >
        BillingApi::
        ssioInsertionOrder_create(
            
            std::string adAccountId
            , 
            
            SSIOInsertionOrderCreate sSIOInsertionOrderCreate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | sSIOInsertionOrderCreate



            payload = sSIOInsertionOrderCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOInsertionOrder obj(output_string);


            Response<SSIOInsertionOrder> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOInsertionOrder
        >
        BillingApi::
        ssioInsertionOrder_edit(
            
            std::string adAccountId
            , 
            
            SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders"; //adAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | sSIOInsertionOrderUpdate



            payload = sSIOInsertionOrderUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOInsertionOrder obj(output_string);


            Response<SSIOInsertionOrder> response(obj, httpCode);
            return response;
        }

        Response<
            Ssio_insertion_orders_status_get_by_ad_account_200_response
        >
        BillingApi::
        ssioInsertionOrdersStatus_getByAdAccount(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ssio_insertion_orders_status_get_by_ad_account_200_response obj(output_string);


            Response<Ssio_insertion_orders_status_get_by_ad_account_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOInsertionOrderStatusResponse
        >
        BillingApi::
        ssioInsertionOrdersStatus_getByPinOrderId(
            
            std::string adAccountId
            , 
            
            std::string pinOrderId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"; //adAccountId pinOrderId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));
                std::string s_pinOrderId("{");
                s_pinOrderId.append("pin_order_id");
                s_pinOrderId.append("}");

                int pos = url.find(s_pinOrderId);

                url.erase(pos, s_pinOrderId.length());
                url.insert(pos, stringify(pinOrderId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOInsertionOrderStatusResponse obj(output_string);


            Response<SSIOInsertionOrderStatusResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Ssio_order_lines_get_by_ad_account_200_response
        >
        BillingApi::
        ssioOrderLines_getByAdAccount(
            
            std::string adAccountId
            , 
            
            std::string pinOrderId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/order_lines"; //adAccountId 


            // Headers  | 

            // Query    | pinOrderId bookmark pageSize 
            addQueryParam("pin_order_id",pinOrderId);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_adAccountId("{");
                s_adAccountId.append("ad_account_id");
                s_adAccountId.append("}");

                int pos = url.find(s_adAccountId);

                url.erase(pos, s_adAccountId.length());
                url.insert(pos, stringify(adAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Ssio_order_lines_get_by_ad_account_200_response obj(output_string);


            Response<Ssio_order_lines_get_by_ad_account_200_response> response(obj, httpCode);
            return response;
        }



