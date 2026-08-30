/*
 * CampaignBatchItem.h
 *
 * Item in a batch campaign response.
 */

#ifndef _CampaignBatchItem_H_
#define _CampaignBatchItem_H_


#include <string>
#include "CampaignBatchResponseData.h"
#include "Exception.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Item in a batch campaign response.
 *
 *  \ingroup Models
 *
 */

class CampaignBatchItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignBatchItem();
	CampaignBatchItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignBatchItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Campaign data on success.
	 */
	CampaignBatchResponseData getData();

	/*! \brief Set Campaign data on success.
	 */
	void setData(CampaignBatchResponseData  data);
	/*! \brief Get Exceptions on failure.
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set Exceptions on failure.
	 */
	void setExceptions(std::list <Exception> exceptions);

private:
	CampaignBatchResponseData data;
	std::list <Exception>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBatchItem_H_ */
