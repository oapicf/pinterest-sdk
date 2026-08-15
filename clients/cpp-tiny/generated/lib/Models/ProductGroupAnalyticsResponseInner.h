
/*
 * ProductGroupAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupAnalyticsResponse_inner_H_
#define TINY_CPP_CLIENT_ProductGroupAnalyticsResponse_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "Date.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupAnalyticsResponse_inner{
public:

    /*! \brief Constructor.
	 */
    ProductGroupAnalyticsResponse_inner();
    ProductGroupAnalyticsResponse_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupAnalyticsResponse_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);
	/*! \brief Get The ID of the product group that this metrics belongs to.
	 */
	std::string getPRODUCTGROUPID();

	/*! \brief Set The ID of the product group that this metrics belongs to.
	 */
	void setPRODUCTGROUPID(std::string  pRODUCT_GROUP_ID);


    private:
    Date dATE;
    std::string pRODUCT_GROUP_ID{};
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupAnalyticsResponse_inner_H_ */
