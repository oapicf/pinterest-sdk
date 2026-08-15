
/*
 * LeadFormTestRequest.h
 *
 * Request to create test data for lead data test API.
 */

#ifndef TINY_CPP_CLIENT_LeadFormTestRequest_H_
#define TINY_CPP_CLIENT_LeadFormTestRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Request to create test data for lead data test API.
 *
 *  \ingroup Models
 *
 */

class LeadFormTestRequest{
public:

    /*! \brief Constructor.
	 */
    LeadFormTestRequest();
    LeadFormTestRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormTestRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Test lead answers. Should follow the creation order.
	 */
	std::list<std::string> getAnswers();

	/*! \brief Set Test lead answers. Should follow the creation order.
	 */
	void setAnswers(std::list <std::string> answers);


    private:
    std::list<std::string> answers;
};
}

#endif /* TINY_CPP_CLIENT_LeadFormTestRequest_H_ */
