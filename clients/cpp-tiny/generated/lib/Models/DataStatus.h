
/*
 * DataStatus.h
 *
 * Metrics availablity, e.g., \&quot;READY\&quot;.
 */

#ifndef TINY_CPP_CLIENT_DataStatus_H_
#define TINY_CPP_CLIENT_DataStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Metrics availablity, e.g., \"READY\".
 *
 *  \ingroup Models
 *
 */

class DataStatus{
public:

    /*! \brief Constructor.
	 */
    DataStatus();
    DataStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DataStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DataStatus_H_ */
