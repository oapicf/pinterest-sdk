/*
 * ConversionProductReportGranularity.h
 *
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 */

#ifndef _ConversionProductReportGranularity_H_
#define _ConversionProductReportGranularity_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportGranularity : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductReportGranularity();
	ConversionProductReportGranularity(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductReportGranularity();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionProductReportGranularity_H_ */
