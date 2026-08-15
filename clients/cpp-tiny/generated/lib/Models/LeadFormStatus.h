
/*
 * LeadFormStatus.h
 *
 * Status of the lead form
 */

#ifndef TINY_CPP_CLIENT_LeadFormStatus_H_
#define TINY_CPP_CLIENT_LeadFormStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Status of the lead form
 *
 *  \ingroup Models
 *
 */

class LeadFormStatus{
public:

    /*! \brief Constructor.
	 */
    LeadFormStatus();
    LeadFormStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LeadFormStatus_H_ */
