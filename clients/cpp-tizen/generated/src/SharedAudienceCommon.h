/*
 * SharedAudienceCommon.h
 *
 * 
 */

#ifndef _SharedAudienceCommon_H_
#define _SharedAudienceCommon_H_


#include <string>
#include "OperationType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	SharedAudienceCommon();
	SharedAudienceCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SharedAudienceCommon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string audience_id;
	OperationType operation_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SharedAudienceCommon_H_ */
