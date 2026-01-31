/*
 * CampaignIdFilter.h
 *
 * 
 */

#ifndef _CampaignIdFilter_H_
#define _CampaignIdFilter_H_


#include <string>
#include <list>
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

class CampaignIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignIdFilter();
	CampaignIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of campaign ids
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set List of campaign ids
	 */
	void setCampaignIds(std::list <std::string> campaign_ids);

private:
	std::list <std::string>campaign_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignIdFilter_H_ */
