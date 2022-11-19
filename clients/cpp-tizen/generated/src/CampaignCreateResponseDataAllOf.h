/*
 * CampaignCreateResponseData_allOf.h
 *
 * 
 */

#ifndef _CampaignCreateResponseData_allOf_H_
#define _CampaignCreateResponseData_allOf_H_


#include <string>
#include "ObjectiveType.h"
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

class CampaignCreateResponseData_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCreateResponseData_allOf();
	CampaignCreateResponseData_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCreateResponseData_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType  objective_type);

private:
	ObjectiveType objective_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCreateResponseData_allOf_H_ */
