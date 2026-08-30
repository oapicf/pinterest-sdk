/*
 * PredictedTimeSeries.h
 *
 * 
 */

#ifndef _PredictedTimeSeries_H_
#define _PredictedTimeSeries_H_


#include <string>
#include "Date.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PredictedTimeSeries : public Object {
public:
	/*! \brief Constructor.
	 */
	PredictedTimeSeries();
	PredictedTimeSeries(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PredictedTimeSeries();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Date getDate();

	/*! \brief Set 
	 */
	void setDate(Date  date);

private:
	Date date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PredictedTimeSeries_H_ */
