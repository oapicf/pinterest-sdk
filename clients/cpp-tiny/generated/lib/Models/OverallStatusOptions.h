
/*
 * OverallStatusOptions.h
 *
 * Overall status of event quality score.
 */

#ifndef TINY_CPP_CLIENT_OverallStatusOptions_H_
#define TINY_CPP_CLIENT_OverallStatusOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Overall status of event quality score.
 *
 *  \ingroup Models
 *
 */

class OverallStatusOptions{
public:

    /*! \brief Constructor.
	 */
    OverallStatusOptions();
    OverallStatusOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OverallStatusOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OverallStatusOptions_H_ */
