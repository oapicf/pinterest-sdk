/*
 * CampaignCreateResponseItem.h
 *
 * 
 */

#ifndef _CampaignCreateResponseItem_H_
#define _CampaignCreateResponseItem_H_


#include <string>
#include "CampaignCreateResponseData.h"
#include "Exception.h"
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

class CampaignCreateResponseItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignCreateResponseItem();
	CampaignCreateResponseItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignCreateResponseItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignCreateResponseData getData();

	/*! \brief Set 
	 */
	void setData(CampaignCreateResponseData  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);

private:
	CampaignCreateResponseData data;
	std::list <Exception>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignCreateResponseItem_H_ */
