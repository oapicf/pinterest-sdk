
/*
 * AdGroupSummaryStatus.h
 *
 * Summary status for ad group
 */

#ifndef TINY_CPP_CLIENT_AdGroupSummaryStatus_H_
#define TINY_CPP_CLIENT_AdGroupSummaryStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Summary status for ad group
 *
 *  \ingroup Models
 *
 */

class AdGroupSummaryStatus{
public:

    /*! \brief Constructor.
	 */
    AdGroupSummaryStatus();
    AdGroupSummaryStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupSummaryStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdGroupSummaryStatus_H_ */
