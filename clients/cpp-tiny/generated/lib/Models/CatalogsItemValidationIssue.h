
/*
 * CatalogsItemValidationIssue.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemValidationIssue_H_
#define TINY_CPP_CLIENT_CatalogsItemValidationIssue_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationIssue{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemValidationIssue();
    CatalogsItemValidationIssue(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemValidationIssue();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemValidationIssue_H_ */
