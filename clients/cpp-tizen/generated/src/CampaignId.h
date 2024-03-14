/*
 * CampaignId.h
 *
 * 
 */

#ifndef _CampaignId_H_
#define _CampaignId_H_


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

class CampaignId : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignId();
	CampaignId(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignId();

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

#endif /* _CampaignId_H_ */
