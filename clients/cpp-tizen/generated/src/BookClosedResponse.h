/*
 * BookClosedResponse.h
 *
 * Creation fields
 */

#ifndef _BookClosedResponse_H_
#define _BookClosedResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Creation fields
 *
 *  \ingroup Models
 *
 */

class BookClosedResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BookClosedResponse();
	BookClosedResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BookClosedResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Are conversion metrics ready?
	 */
	bool getConversionMetricsReady();

	/*! \brief Set Are conversion metrics ready?
	 */
	void setConversionMetricsReady(bool  conversion_metrics_ready);
	/*! \brief Get Are non-conversion metrics ready?
	 */
	bool getNonConversionMetricsReady();

	/*! \brief Set Are non-conversion metrics ready?
	 */
	void setNonConversionMetricsReady(bool  non_conversion_metrics_ready);

private:
	bool conversion_metrics_ready;
	bool non_conversion_metrics_ready;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BookClosedResponse_H_ */
