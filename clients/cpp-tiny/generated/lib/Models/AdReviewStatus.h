
/*
 * AdReviewStatus.h
 *
 * Ad review status
 */

#ifndef TINY_CPP_CLIENT_AdReviewStatus_H_
#define TINY_CPP_CLIENT_AdReviewStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad review status
 *
 *  \ingroup Models
 *
 */

class AdReviewStatus{
public:

    /*! \brief Constructor.
	 */
    AdReviewStatus();
    AdReviewStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdReviewStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdReviewStatus_H_ */
