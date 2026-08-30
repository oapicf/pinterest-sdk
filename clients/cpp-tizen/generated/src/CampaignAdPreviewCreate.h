/*
 * CampaignAdPreviewCreate.h
 *
 * Resource create operation model.
 */

#ifndef _CampaignAdPreviewCreate_H_
#define _CampaignAdPreviewCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CampaignAdPreviewCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignAdPreviewCreate();
	CampaignAdPreviewCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignAdPreviewCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad group ID to create a preview record for.
	 */
	std::string getAdGroupId();

	/*! \brief Set Ad group ID to create a preview record for.
	 */
	void setAdGroupId(std::string  ad_group_id);

private:
	std::string ad_group_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignAdPreviewCreate_H_ */
