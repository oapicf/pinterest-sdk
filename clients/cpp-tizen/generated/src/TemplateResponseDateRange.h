/*
 * TemplateResponse_date_range.h
 *
 * 
 */

#ifndef _TemplateResponse_date_range_H_
#define _TemplateResponse_date_range_H_


#include <string>
#include "TemplateResponse_date_range_absolute_date_range.h"
#include "TemplateResponse_date_range_dynamic_date_range.h"
#include "TemplateResponse_date_range_relative_date_range.h"
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

class TemplateResponse_date_range : public Object {
public:
	/*! \brief Constructor.
	 */
	TemplateResponse_date_range();
	TemplateResponse_date_range(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemplateResponse_date_range();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TemplateResponse_date_range_dynamic_date_range getDynamicDateRange();

	/*! \brief Set 
	 */
	void setDynamicDateRange(TemplateResponse_date_range_dynamic_date_range  dynamic_date_range);
	/*! \brief Get 
	 */
	TemplateResponse_date_range_relative_date_range getRelativeDateRange();

	/*! \brief Set 
	 */
	void setRelativeDateRange(TemplateResponse_date_range_relative_date_range  relative_date_range);
	/*! \brief Get 
	 */
	TemplateResponse_date_range_absolute_date_range getAbsoluteDateRange();

	/*! \brief Set 
	 */
	void setAbsoluteDateRange(TemplateResponse_date_range_absolute_date_range  absolute_date_range);

private:
	TemplateResponse_date_range_dynamic_date_range dynamic_date_range;
	TemplateResponse_date_range_relative_date_range relative_date_range;
	TemplateResponse_date_range_absolute_date_range absolute_date_range;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemplateResponse_date_range_H_ */
