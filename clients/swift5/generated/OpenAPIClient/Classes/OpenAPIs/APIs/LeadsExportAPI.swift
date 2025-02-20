//
// LeadsExportAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class LeadsExportAPI {

    /**
     Create a request to export leads collected from a lead ad
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter leadsExportCreateRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func leadsExportCreate(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: LeadsExportCreateResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return leadsExportCreateWithRequestBuilder(adAccountId: adAccountId, leadsExportCreateRequest: leadsExportCreateRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Create a request to export leads collected from a lead ad
     - POST /ad_accounts/{ad_account_id}/leads_export
     - <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter leadsExportCreateRequest: (body)  
     - returns: RequestBuilder<LeadsExportCreateResponse> 
     */
    open class func leadsExportCreateWithRequestBuilder(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest) -> RequestBuilder<LeadsExportCreateResponse> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/leads_export"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: leadsExportCreateRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<LeadsExportCreateResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Get the lead export from the lead export create call
     
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter leadsExportId: (path) lead_export_id token returned from the create a lead export endpoint 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func leadsExportGet(adAccountId: String, leadsExportId: String, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: LeadsExportResponseData?, _ error: Error?) -> Void)) -> RequestTask {
        return leadsExportGetWithRequestBuilder(adAccountId: adAccountId, leadsExportId: leadsExportId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get the lead export from the lead export create call
     - GET /ad_accounts/{ad_account_id}/leads_export/{leads_export_id}
     - <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     - OAuth:
       - type: oauth2
       - name: pinterest_oauth2
     - parameter adAccountId: (path) Unique identifier of an ad account. 
     - parameter leadsExportId: (path) lead_export_id token returned from the create a lead export endpoint 
     - returns: RequestBuilder<LeadsExportResponseData> 
     */
    open class func leadsExportGetWithRequestBuilder(adAccountId: String, leadsExportId: String) -> RequestBuilder<LeadsExportResponseData> {
        var localVariablePath = "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"
        let adAccountIdPreEscape = "\(APIHelper.mapValueToPathItem(adAccountId))"
        let adAccountIdPostEscape = adAccountIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{ad_account_id}", with: adAccountIdPostEscape, options: .literal, range: nil)
        let leadsExportIdPreEscape = "\(APIHelper.mapValueToPathItem(leadsExportId))"
        let leadsExportIdPostEscape = leadsExportIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{leads_export_id}", with: leadsExportIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<LeadsExportResponseData>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
