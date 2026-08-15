
/*
 * SharedAudienceCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SharedAudienceCommon_H_
#define TINY_CPP_CLIENT_SharedAudienceCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OperationType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceCommon{
public:

    /*! \brief Constructor.
	 */
    SharedAudienceCommon();
    SharedAudienceCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SharedAudienceCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of an audience
	 */
	std::string getAudienceId();

	/*! \brief Set Unique identifier of an audience
	 */
	void setAudienceId(std::string  audience_id);
	/*! \brief Get 
	 */
	OperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(OperationType  operation_type);


    private:
    std::string audience_id{};
    OperationType operation_type;
};
}

#endif /* TINY_CPP_CLIENT_SharedAudienceCommon_H_ */
