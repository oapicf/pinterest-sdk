
/*
 * ConversionProductReportGranularity.h
 *
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 */

#ifndef TINY_CPP_CLIENT_ConversionProductReportGranularity_H_
#define TINY_CPP_CLIENT_ConversionProductReportGranularity_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportGranularity{
public:

    /*! \brief Constructor.
	 */
    ConversionProductReportGranularity();
    ConversionProductReportGranularity(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductReportGranularity();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductReportGranularity_H_ */
