
/*
 * LeadFormQuestionFieldType.h
 *
 * Lead form question field type
 */

#ifndef TINY_CPP_CLIENT_LeadFormQuestionFieldType_H_
#define TINY_CPP_CLIENT_LeadFormQuestionFieldType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Lead form question field type
 *
 *  \ingroup Models
 *
 */

class LeadFormQuestionFieldType{
public:

    /*! \brief Constructor.
	 */
    LeadFormQuestionFieldType();
    LeadFormQuestionFieldType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormQuestionFieldType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LeadFormQuestionFieldType_H_ */
