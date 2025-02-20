//
// TargetingTemplateAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class TargetingTemplateAPI {

    /**
     Create targeting templates
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter targetingTemplateCreate: (body) targeting template creation entity 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: TargetingTemplateGetResponseData?, _ error: Error?) -> Void)) -> RequestTask {
        return targetingTemplateCreateWithRequestBuilder(adAccountId: adAccountId, targetingTemplateCreate: targetingTemplateCreate).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Create targeting templates
     - POST /ad_accounts/{ad_account_id}/targeting_templates
     - <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter targetingTemplateCreate: (body) targeting template creation entity 
     - returns: RequestBuilder<TargetingTemplateGetResponseData> 
     */
    open class func targetingTemplateCreateWithRequestBuilder(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate) -> RequestBuilder<TargetingTemplateGetResponseData> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/targeting_templates"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: targetingTemplateCreate)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<TargetingTemplateGetResponseData>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     * enum for parameter order
     */
    public enum Order_targetingTemplateList: String, CaseIterable {
        case ascending = "ASCENDING"
        case descending = "DESCENDING"
    }

    /**
     List targeting templates
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     - parameter includeSizing: (query) Include audience sizing in result or not (optional, default to false)
     - parameter searchQuery: (query) Search keyword for targeting templates (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func targetingTemplateList(adAccountId: String, order: Order_targetingTemplateList? = nil, includeSizing: Bool? = nil, searchQuery: String? = nil, pageSize: Int? = nil, bookmark: String? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: TargetingTemplateList200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return targetingTemplateListWithRequestBuilder(adAccountId: adAccountId, order: order, includeSizing: includeSizing, searchQuery: searchQuery, pageSize: pageSize, bookmark: bookmark).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     List targeting templates
     - GET /ad_accounts/{ad_account_id}/targeting_templates
     - Get a list of the targeting templates in the specified <code>ad_account_id</code>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter order: (query) The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     - parameter includeSizing: (query) Include audience sizing in result or not (optional, default to false)
     - parameter searchQuery: (query) Search keyword for targeting templates (optional)
     - parameter pageSize: (query) Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     - parameter bookmark: (query) Cursor used to fetch the next page of items (optional)
     - returns: RequestBuilder<TargetingTemplateList200Response> 
     */
    open class func targetingTemplateListWithRequestBuilder(adAccountId: String, order: Order_targetingTemplateList? = nil, includeSizing: Bool? = nil, searchQuery: String? = nil, pageSize: Int? = nil, bookmark: String? = nil) -> RequestBuilder<TargetingTemplateList200Response> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/targeting_templates"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "order": (wrappedValue: order?.encodeToJSON(), isExplode: true),
            "include_sizing": (wrappedValue: includeSizing?.encodeToJSON(), isExplode: true),
            "search_query": (wrappedValue: searchQuery?.encodeToJSON(), isExplode: true),
            "page_size": (wrappedValue: pageSize?.encodeToJSON(), isExplode: true),
            "bookmark": (wrappedValue: bookmark?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<TargetingTemplateList200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Update targeting templates
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter targetingTemplateUpdateRequest: (body) Operation type and targeting template ID 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: Void?, _ error: Error?) -> Void)) -> RequestTask {
        return targetingTemplateUpdateWithRequestBuilder(adAccountId: adAccountId, targetingTemplateUpdateRequest: targetingTemplateUpdateRequest).execute(apiResponseQueue) { result in
            switch result {
            case .success:
                completion((), nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Update targeting templates
     - PATCH /ad_accounts/{ad_account_id}/targeting_templates
     - <p>Update the targeting template given advertiser ID and targeting template ID</p>
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter targetingTemplateUpdateRequest: (body) Operation type and targeting template ID 
     - returns: RequestBuilder<Void> 
     */
    open class func targetingTemplateUpdateWithRequestBuilder(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest) -> RequestBuilder<Void> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/targeting_templates"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: targetingTemplateUpdateRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = OpenAPIClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "PATCH", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
