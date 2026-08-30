/*
 * CampaignBatchWriteResponseModel.h
 *
 * Response model for batch campaign write operations.
 */

#ifndef _CampaignBatchWriteResponseModel_H_
#define _CampaignBatchWriteResponseModel_H_


#include <string>
#include "CampaignBatchItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response model for batch campaign write operations.
 *
 *  \ingroup Models
 *
 */

class CampaignBatchWriteResponseModel : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignBatchWriteResponseModel();
	CampaignBatchWriteResponseModel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignBatchWriteResponseModel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CampaignBatchItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CampaignBatchItem> items);

private:
	std::list <CampaignBatchItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBatchWriteResponseModel_H_ */
