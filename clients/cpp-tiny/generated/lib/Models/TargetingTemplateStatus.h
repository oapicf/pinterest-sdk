
/*
 * TargetingTemplateStatus.h
 *
 * Indicate targeting template is active or Deleted
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateStatus_H_
#define TINY_CPP_CLIENT_TargetingTemplateStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Indicate targeting template is active or Deleted
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateStatus{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateStatus();
    TargetingTemplateStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateStatus_H_ */
