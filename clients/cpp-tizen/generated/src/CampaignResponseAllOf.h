/*
 * CampaignResponse_allOf.h
 *
 * 
 */

#ifndef _CampaignResponse_allOf_H_
#define _CampaignResponse_allOf_H_


#include <string>
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

class CampaignResponse_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignResponse_allOf();
	CampaignResponse_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignResponse_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Campaign ID.
	 */
	std::string getId();

	/*! \brief Set Campaign ID.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignResponse_allOf_H_ */
