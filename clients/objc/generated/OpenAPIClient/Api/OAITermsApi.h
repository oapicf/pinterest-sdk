#import <Foundation/Foundation.h>
#import "OAIError.h"
#import "OAIRelatedTerms.h"
#import "OAIApi.h"

/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAITermsApi: NSObject <OAIApi>

extern NSString* kOAITermsApiErrorDomain;
extern NSInteger kOAITermsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// List related terms
/// Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
///
/// @param terms List of input terms.
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid terms related parameters.",
///  code:0 message:"Unexpected error"
///
/// @return OAIRelatedTerms*
-(NSURLSessionTask*) termsRelatedListWithTerms: (NSArray<NSString*>*) terms
    completionHandler: (void (^)(OAIRelatedTerms* output, NSError* error)) handler;


/// List suggested terms
/// Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
///
/// @param term Input term.
/// @param limit Max suggested terms to return. (optional) (default to @4)
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid terms suggested parameters.",
///  code:0 message:"Unexpected error"
///
/// @return NSArray<NSString*>*
-(NSURLSessionTask*) termsSuggestedListWithTerm: (NSString*) term
    limit: (NSNumber*) limit
    completionHandler: (void (^)(NSArray<NSString*>* output, NSError* error)) handler;



@end
