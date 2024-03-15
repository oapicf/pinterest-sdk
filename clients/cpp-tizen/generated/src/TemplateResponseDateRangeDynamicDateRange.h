/*
 * TemplateResponse_date_range_dynamic_date_range.h
 *
 * The dynamic date range of the template
 */

#ifndef _TemplateResponse_date_range_dynamic_date_range_H_
#define _TemplateResponse_date_range_dynamic_date_range_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The dynamic date range of the template
 *
 *  \ingroup Models
 *
 */

class TemplateResponse_date_range_dynamic_date_range : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateResponse_date_range_dynamic_date_range();
	TemplateResponse_date_range_dynamic_date_range(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateResponse_date_range_dynamic_date_range();

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
	/*! \brief Get The dynamic range type
	 */
	std::string getRange();

	/*! \brief Set The dynamic range type
	 */
	void setRange(std::string  range);

private:
	std::string type;
	std::string range;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateResponse_date_range_dynamic_date_range_H_ */
