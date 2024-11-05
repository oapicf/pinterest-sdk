#import "OAIAdvancedAuctionApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdvancedAuctionItems.h"
#import "OAIAdvancedAuctionItemsGetRequest.h"
#import "OAIAdvancedAuctionItemsSubmitRequest.h"
#import "OAIAdvancedAuctionProcessedItems.h"
#import "OAIError.h"


@interface OAIAdvancedAuctionApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAdvancedAuctionApi

NSString* kOAIAdvancedAuctionApiErrorDomain = @"OAIAdvancedAuctionApiErrorDomain";
NSInteger kOAIAdvancedAuctionApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Get item bid options (POST)
/// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
///  @param advancedAuctionItemsGetRequest Request object used to get bid options values for a batch of retail catalog items 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIAdvancedAuctionItems*
///
-(NSURLSessionTask*) advancedAuctionItemsGetPostWithAdvancedAuctionItemsGetRequest: (OAIAdvancedAuctionItemsGetRequest*) advancedAuctionItemsGetRequest
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIAdvancedAuctionItems* output, NSError* error)) handler {
    // verify the required parameter 'advancedAuctionItemsGetRequest' is set
    if (advancedAuctionItemsGetRequest == nil) {
        NSParameterAssert(advancedAuctionItemsGetRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"advancedAuctionItemsGetRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAdvancedAuctionApiErrorDomain code:kOAIAdvancedAuctionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/advanced_auction/items/get"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = advancedAuctionItemsGetRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIAdvancedAuctionItems*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdvancedAuctionItems*)data, error);
                                }
                            }];
}

///
/// Operate on item level bid options
/// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
///  @param advancedAuctionItemsSubmitRequest Request object used to upsert or delete bid options for a batch of retail catalog items 
///
///  @param adAccountId Unique identifier of an ad account. (optional)
///
///  @returns OAIAdvancedAuctionProcessedItems*
///
-(NSURLSessionTask*) advancedAuctionItemsSubmitPostWithAdvancedAuctionItemsSubmitRequest: (OAIAdvancedAuctionItemsSubmitRequest*) advancedAuctionItemsSubmitRequest
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIAdvancedAuctionProcessedItems* output, NSError* error)) handler {
    // verify the required parameter 'advancedAuctionItemsSubmitRequest' is set
    if (advancedAuctionItemsSubmitRequest == nil) {
        NSParameterAssert(advancedAuctionItemsSubmitRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"advancedAuctionItemsSubmitRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAdvancedAuctionApiErrorDomain code:kOAIAdvancedAuctionApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/advanced_auction/items/submit"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (adAccountId != nil) {
        queryParams[@"ad_account_id"] = adAccountId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"pinterest_oauth2"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = advancedAuctionItemsSubmitRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIAdvancedAuctionProcessedItems*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdvancedAuctionProcessedItems*)data, error);
                                }
                            }];
}



@end
