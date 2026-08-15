#include "BillingApi.h"

using namespace Tiny;



        Response<
            AdsCreditRedeemResponse
        >
        BillingApi::
        adsCredit_redeem(
            
            std::string adAccountId
            , 
            
            AdsCreditRedeemRequest adsCreditRedeemRequest
            
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
            // Body     | adsCreditRedeemRequest



            payload = adsCreditRedeemRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdsCreditRedeemResponse obj(output_string);


            Response<AdsCreditRedeemResponse> response(obj, httpCode);
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
            
            std::string sort
            , 
            
            std::string order
            , 
            
            std::string status
            , 
            
            std::string documentType
            , 
            
            Date startDueDate
            , 
            
            Date endDueDate
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/billing_invoices"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize sort order status documentType startDueDate endDueDate 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("sort",sort);
            addQueryParam("order",order);
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
            
            std::string adAccountId
            , 
            
            bool isActive
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
            SSIOAccountResponse
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




            SSIOAccountResponse obj(output_string);


            Response<SSIOAccountResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOCreateInsertionOrderResponse
        >
        BillingApi::
        ssioInsertionOrder_create(
            
            std::string adAccountId
            , 
            
            SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest
            
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
            // Body     | sSIOCreateInsertionOrderRequest



            payload = sSIOCreateInsertionOrderRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOCreateInsertionOrderResponse obj(output_string);


            Response<SSIOCreateInsertionOrderResponse> response(obj, httpCode);
            return response;
        }

        Response<
            SSIOEditInsertionOrderResponse
        >
        BillingApi::
        ssioInsertionOrder_edit(
            
            std::string adAccountId
            , 
            
            SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest
            
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
            // Body     | sSIOEditInsertionOrderRequest



            payload = sSIOEditInsertionOrderRequest.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SSIOEditInsertionOrderResponse obj(output_string);


            Response<SSIOEditInsertionOrderResponse> response(obj, httpCode);
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
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string pinOrderId
            
        )
        {
            std::string url = basepath + "/ad_accounts/{ad_account_id}/ssio/order_lines"; //adAccountId 


            // Headers  | 

            // Query    | bookmark pageSize pinOrderId 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            addQueryParam("pin_order_id",pinOrderId);

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



