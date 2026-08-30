
/*
 * LeadFormTestCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_LeadFormTestCreate_H_
#define TINY_CPP_CLIENT_LeadFormTestCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LeadFormTestCreate{
public:

    /*! \brief Constructor.
	 */
    LeadFormTestCreate();
    LeadFormTestCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormTestCreate();


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
	void setAnswers(std::list<std::string> answers);


    private:
    std::list<std::string> answers;
};
}

#endif /* TINY_CPP_CLIENT_LeadFormTestCreate_H_ */
