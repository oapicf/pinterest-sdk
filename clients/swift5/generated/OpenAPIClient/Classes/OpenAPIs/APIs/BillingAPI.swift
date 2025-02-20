//
// BillingAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class BillingAPI {

    /**
     Redeem ad credits
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter adsCreditRedeemRequest: (body) Redeem ad credits request. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func adsCreditRedeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: AdsCreditRedeemResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return adsCreditRedeemWithRequestBuilder(adAccountId: adAccountId, adsCreditRedeemRequest: adsCreditRedeemRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Redeem ad credits
     - POST /ad_accounts/{ad_account_id}/ads_credit/redeem
     - Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter adsCreditRedeemRequest: (body) Redeem ad credits request. 
     - returns: RequestBuilder<AdsCreditRedeemResponse> 
     */
    open class func adsCreditRedeemWithRequestBuilder(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest) -> RequestBuilder<AdsCreditRedeemResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ads_credit/redeem"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: adsCreditRedeemRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<AdsCreditRedeemResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get ads credit discounts
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func adsCreditsDiscountsGet(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: AdsCreditsDiscountsGet200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return adsCreditsDiscountsGetWithRequestBuilder(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get ads credit discounts
     - GET /ad_accounts/{ad_account_id}/ads_credit/discounts
     - Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - returns: RequestBuilder<AdsCreditsDiscountsGet200Response> 
     */
    open class func adsCreditsDiscountsGetWithRequestBuilder(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil) -> RequestBuilder<AdsCreditsDiscountsGet200Response> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ads_credit/discounts"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "bookmark": (wrappedValue: bookmark?.encodeToJSON(), isExplode: true),
            "page_size": (wrappedValue: pageSize?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<AdsCreditsDiscountsGet200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get billing profiles
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter isActive: (query) Return active billing profiles, if false return all billing profiles. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func billingProfilesGet(adAccountId: String, isActive: Bool, bookmark: String? = nil, pageSize: Int? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: BillingProfilesGet200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return billingProfilesGetWithRequestBuilder(adAccountId: adAccountId, isActive: isActive, bookmark: bookmark, pageSize: pageSize).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get billing profiles
     - GET /ad_accounts/{ad_account_id}/billing_profiles
     - Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter isActive: (query) Return active billing profiles, if false return all billing profiles. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - returns: RequestBuilder<BillingProfilesGet200Response> 
     */
    open class func billingProfilesGetWithRequestBuilder(adAccountId: String, isActive: Bool, bookmark: String? = nil, pageSize: Int? = nil) -> RequestBuilder<BillingProfilesGet200Response> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/billing_profiles"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "is_active": (wrappedValue: isActive.encodeToJSON(), isExplode: true),
            "bookmark": (wrappedValue: bookmark?.encodeToJSON(), isExplode: true),
            "page_size": (wrappedValue: pageSize?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<BillingProfilesGet200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get Salesforce account details including bill-to information.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioAccountsGet(adAccountId: String, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SSIOAccountResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioAccountsGetWithRequestBuilder(adAccountId: adAccountId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get Salesforce account details including bill-to information.
     - GET /ad_accounts/{ad_account_id}/ssio/accounts
     - Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - returns: RequestBuilder<SSIOAccountResponse> 
     */
    open class func ssioAccountsGetWithRequestBuilder(adAccountId: String) -> RequestBuilder<SSIOAccountResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/accounts"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SSIOAccountResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Create insertion order through SSIO.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter sSIOCreateInsertionOrderRequest: (body) Order line to create. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioInsertionOrderCreate(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SSIOCreateInsertionOrderResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioInsertionOrderCreateWithRequestBuilder(adAccountId: adAccountId, sSIOCreateInsertionOrderRequest: sSIOCreateInsertionOrderRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Create insertion order through SSIO.
     - POST /ad_accounts/{ad_account_id}/ssio/insertion_orders
     - Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter sSIOCreateInsertionOrderRequest: (body) Order line to create. 
     - returns: RequestBuilder<SSIOCreateInsertionOrderResponse> 
     */
    open class func ssioInsertionOrderCreateWithRequestBuilder(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest) -> RequestBuilder<SSIOCreateInsertionOrderResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sSIOCreateInsertionOrderRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SSIOCreateInsertionOrderResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Edit insertion order through SSIO.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter sSIOEditInsertionOrderRequest: (body) Order line to create. 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioInsertionOrderEdit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SSIOEditInsertionOrderResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioInsertionOrderEditWithRequestBuilder(adAccountId: adAccountId, sSIOEditInsertionOrderRequest: sSIOEditInsertionOrderRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Edit insertion order through SSIO.
     - PATCH /ad_accounts/{ad_account_id}/ssio/insertion_orders
     - Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter sSIOEditInsertionOrderRequest: (body) Order line to create. 
     - returns: RequestBuilder<SSIOEditInsertionOrderResponse> 
     */
    open class func ssioInsertionOrderEditWithRequestBuilder(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest) -> RequestBuilder<SSIOEditInsertionOrderResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/insertion_orders"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: sSIOEditInsertionOrderRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SSIOEditInsertionOrderResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "PATCH", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get insertion order status by ad account id.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioInsertionOrdersStatusGetByAdAccount(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SsioInsertionOrdersStatusGetByAdAccount200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioInsertionOrdersStatusGetByAdAccountWithRequestBuilder(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get insertion order status by ad account id.
     - GET /ad_accounts/{ad_account_id}/ssio/insertion_orders/status
     - Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - returns: RequestBuilder<SsioInsertionOrdersStatusGetByAdAccount200Response> 
     */
    open class func ssioInsertionOrdersStatusGetByAdAccountWithRequestBuilder(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil) -> RequestBuilder<SsioInsertionOrdersStatusGetByAdAccount200Response> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "bookmark": (wrappedValue: bookmark?.encodeToJSON(), isExplode: true),
            "page_size": (wrappedValue: pageSize?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SsioInsertionOrdersStatusGetByAdAccount200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get insertion order status by pin order id.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter pinOrderId: (path) The pin order id associated with the ssio insertion order 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: String, pinOrderId: String, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SSIOInsertionOrderStatusResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioInsertionOrdersStatusGetByPinOrderIdWithRequestBuilder(adAccountId: adAccountId, pinOrderId: pinOrderId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get insertion order status by pin order id.
     - GET /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status
     - Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter pinOrderId: (path) The pin order id associated with the ssio insertion order 
     - returns: RequestBuilder<SSIOInsertionOrderStatusResponse> 
     */
    open class func ssioInsertionOrdersStatusGetByPinOrderIdWithRequestBuilder(adAccountId: String, pinOrderId: String) -> RequestBuilder<SSIOInsertionOrderStatusResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let pinOrderIdPreEscape = "\(APIHelper.mapValueToPathItem(pinOrderId))"
        let pinOrderIdPostEscape = pinOrderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{pin_order_id}", with: pinOrderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SSIOInsertionOrderStatusResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get Salesforce order lines by ad account id.
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter pinOrderId: (query) The pin order id associated with the ssio insertino order (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ssioOrderLinesGetByAdAccount(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, pinOrderId: String? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: SsioOrderLinesGetByAdAccount200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return ssioOrderLinesGetByAdAccountWithRequestBuilder(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, pinOrderId: pinOrderId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get Salesforce order lines by ad account id.
     - GET /ad_accounts/{ad_account_id}/ssio/order_lines
     - Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter pinOrderId: (query) The pin order id associated with the ssio insertino order (optional)
     - returns: RequestBuilder<SsioOrderLinesGetByAdAccount200Response> 
     */
    open class func ssioOrderLinesGetByAdAccountWithRequestBuilder(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, pinOrderId: String? = nil) -> RequestBuilder<SsioOrderLinesGetByAdAccount200Response> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/ssio/order_lines"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "bookmark": (wrappedValue: bookmark?.encodeToJSON(), isExplode: true),
            "page_size": (wrappedValue: pageSize?.encodeToJSON(), isExplode: true),
            "pin_order_id": (wrappedValue: pinOrderId?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<SsioOrderLinesGetByAdAccount200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
