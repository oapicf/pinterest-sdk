
/*
 * TemplateResponse_date_range_absolute_date_range.h
 *
 * The absolute date range of the template
 */

#ifndef TINY_CPP_CLIENT_TemplateResponse_date_range_absolute_date_range_H_
#define TINY_CPP_CLIENT_TemplateResponse_date_range_absolute_date_range_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The absolute date range of the template
 *
 *  \ingroup Models
 *
 */

class TemplateResponse_date_range_absolute_date_range{
public:

    /*! \brief Constructor.
	 */
    TemplateResponse_date_range_absolute_date_range();
    TemplateResponse_date_range_absolute_date_range(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TemplateResponse_date_range_absolute_date_range();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The end date of the date range
	 */
	long getEndDate();

	/*! \brief Set The end date of the date range
	 */
	void setEndDate(long  end_date);
	/*! \brief Get The start date of the date range
	 */
	long getStartDate();

	/*! \brief Set The start date of the date range
	 */
	void setStartDate(long  start_date);
	/*! \brief Get The date range type
	 */
	std::string getType();

	/*! \brief Set The date range type
	 */
	void setType(std::string  type);


    private:
    long end_date{};
    long start_date{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_TemplateResponse_date_range_absolute_date_range_H_ */
