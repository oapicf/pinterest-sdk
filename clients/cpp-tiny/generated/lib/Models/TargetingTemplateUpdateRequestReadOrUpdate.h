
/*
 * TargetingTemplateUpdateRequestReadOrUpdate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateUpdateRequestReadOrUpdate_H_
#define TINY_CPP_CLIENT_TargetingTemplateUpdateRequestReadOrUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceUpdateOperationType.h"
#include "TargetingSpecOptimal.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateUpdateRequestReadOrUpdate{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateUpdateRequestReadOrUpdate();
    TargetingTemplateUpdateRequestReadOrUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateUpdateRequestReadOrUpdate();


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
	void setId(std::string id);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType operation_type);
	/*! \brief Get targeting profile attributes
	 */
	TargetingSpecOptimal getTargetingAttributes();

	/*! \brief Set targeting profile attributes
	 */
	void setTargetingAttributes(TargetingSpecOptimal targeting_attributes);


    private:
    std::string id{};
    AudienceUpdateOperationType operation_type;
    TargetingSpecOptimal targeting_attributes;
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateUpdateRequestReadOrUpdate_H_ */
