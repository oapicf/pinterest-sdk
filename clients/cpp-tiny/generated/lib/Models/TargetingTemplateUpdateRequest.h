
/*
 * TargetingTemplateUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateUpdateRequest_H_
#define TINY_CPP_CLIENT_TargetingTemplateUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpec.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateUpdateRequest();
    TargetingTemplateUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Targeting template ID
	 */
	std::string getId();

	/*! \brief Set Targeting template ID
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(std::string  operation_type);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingAttributes();

	/*! \brief Set 
	 */
	void setTargetingAttributes(TargetingSpec  targeting_attributes);


    private:
    std::string id{};
    std::string operation_type{};
    TargetingSpec targeting_attributes;
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateUpdateRequest_H_ */
