#ifndef TINY_CPP_CLIENT_ConversionEqsApi_H_
#define TINY_CPP_CLIENT_ConversionEqsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "EventQualityScore.h"
#include "IngestionSourceOptions.h"
#include "LookbackPeriodOptions.h"
#include "Pinterest.Lib.Error.h"
#include "SourcePlatformOptions.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionEqsApi : public Service {
public:
    ConversionEqsApi() = default;

    virtual ~ConversionEqsApi();

    /**
    * Get event quality score (EQS).
    *
    * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
    * \param lookbackPeriod Lookback window (number of days). *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sourcePlatform Source platform of event.
    * \param ingestionSource Ingestion source of event.
    */
    Response<
                    std::list<EventQualityScore>
        >
    conversionEqs_list(
            
            LookbackPeriodOptions lookbackPeriod
            , 
            
            std::string adAccountId
            , 
            
            SourcePlatformOptions sourcePlatform
            , 
            
            IngestionSourceOptions ingestionSource
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionEqsApi_H_ */