/*
 * TemplateResponse_date_range_relative_date_range.h
 *
 * The relative date range of the template
 */

#ifndef _TemplateResponse_date_range_relative_date_range_H_
#define _TemplateResponse_date_range_relative_date_range_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The relative date range of the template
 *
 *  \ingroup Models
 *
 */

class TemplateResponse_date_range_relative_date_range : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateResponse_date_range_relative_date_range();
	TemplateResponse_date_range_relative_date_range(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateResponse_date_range_relative_date_range();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The date range type
	 */
	std::string getType();

	/*! \brief Set The date range type
	 */
	void setType(std::string  type);
	/*! \brief Get The start date of the date range
	 */
	long long getStartDaysInPast();

	/*! \brief Set The start date of the date range
	 */
	void setStartDaysInPast(long long  start_days_in_past);
	/*! \brief Get The end date of the date range
	 */
	long long getEndDaysInPast();

	/*! \brief Set The end date of the date range
	 */
	void setEndDaysInPast(long long  end_days_in_past);

private:
	std::string type;
	long long start_days_in_past;
	long long end_days_in_past;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateResponse_date_range_relative_date_range_H_ */
