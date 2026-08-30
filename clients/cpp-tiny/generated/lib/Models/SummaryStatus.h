
/*
 * SummaryStatus.h
 *
 * Summary status for campaign
 */

#ifndef TINY_CPP_CLIENT_SummaryStatus_H_
#define TINY_CPP_CLIENT_SummaryStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Summary status for campaign
 *
 *  \ingroup Models
 *
 */

class SummaryStatus{
public:

    /*! \brief Constructor.
	 */
    SummaryStatus();
    SummaryStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SummaryStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SummaryStatus_H_ */
