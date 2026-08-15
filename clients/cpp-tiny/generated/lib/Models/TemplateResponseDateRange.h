
/*
 * TemplateResponse_date_range.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TemplateResponse_date_range_H_
#define TINY_CPP_CLIENT_TemplateResponse_date_range_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TemplateResponse_date_range_absolute_date_range.h"
#include "TemplateResponse_date_range_dynamic_date_range.h"
#include "TemplateResponse_date_range_relative_date_range.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TemplateResponse_date_range{
public:

    /*! \brief Constructor.
	 */
    TemplateResponse_date_range();
    TemplateResponse_date_range(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TemplateResponse_date_range();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TemplateResponse_date_range_absolute_date_range getAbsoluteDateRange();

	/*! \brief Set 
	 */
	void setAbsoluteDateRange(TemplateResponse_date_range_absolute_date_range  absolute_date_range);
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


    private:
    TemplateResponse_date_range_absolute_date_range absolute_date_range;
    TemplateResponse_date_range_dynamic_date_range dynamic_date_range;
    TemplateResponse_date_range_relative_date_range relative_date_range;
};
}

#endif /* TINY_CPP_CLIENT_TemplateResponse_date_range_H_ */
