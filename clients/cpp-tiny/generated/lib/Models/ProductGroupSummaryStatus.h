
/*
 * ProductGroupSummaryStatus.h
 *
 * Summary status for product group
 */

#ifndef TINY_CPP_CLIENT_ProductGroupSummaryStatus_H_
#define TINY_CPP_CLIENT_ProductGroupSummaryStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Summary status for product group
 *
 *  \ingroup Models
 *
 */

class ProductGroupSummaryStatus{
public:

    /*! \brief Constructor.
	 */
    ProductGroupSummaryStatus();
    ProductGroupSummaryStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupSummaryStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupSummaryStatus_H_ */
