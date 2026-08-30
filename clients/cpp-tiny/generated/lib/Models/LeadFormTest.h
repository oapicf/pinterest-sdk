
/*
 * LeadFormTest.h
 *
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */

#ifndef TINY_CPP_CLIENT_LeadFormTest_H_
#define TINY_CPP_CLIENT_LeadFormTest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Lead form test action: submit sample answers and receive the resulting subscription id.
 *
 *  \ingroup Models
 *
 */

class LeadFormTest{
public:

    /*! \brief Constructor.
	 */
    LeadFormTest();
    LeadFormTest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormTest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Subscription ID.
	 */
	std::string getSubscriptionId();

	/*! \brief Set Subscription ID.
	 */
	void setSubscriptionId(std::string subscription_id);


    private:
    std::string subscription_id{};
};
}

#endif /* TINY_CPP_CLIENT_LeadFormTest_H_ */
