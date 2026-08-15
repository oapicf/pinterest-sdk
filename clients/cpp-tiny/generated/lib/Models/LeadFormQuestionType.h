
/*
 * LeadFormQuestionType.h
 *
 * Lead form question type
 */

#ifndef TINY_CPP_CLIENT_LeadFormQuestionType_H_
#define TINY_CPP_CLIENT_LeadFormQuestionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Lead form question type
 *
 *  \ingroup Models
 *
 */

class LeadFormQuestionType{
public:

    /*! \brief Constructor.
	 */
    LeadFormQuestionType();
    LeadFormQuestionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormQuestionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LeadFormQuestionType_H_ */
