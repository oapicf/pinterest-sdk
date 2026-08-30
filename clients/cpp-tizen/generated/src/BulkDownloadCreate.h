/*
 * BulkDownloadCreate.h
 *
 * Resource create operation model.
 */

#ifndef _BulkDownloadCreate_H_
#define _BulkDownloadCreate_H_


#include <string>
#include "BulkDownloadCampaignFilter.h"
#include "BulkEntityType.h"
#include "BulkOutputFormat.h"
#include <list>
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

class BulkDownloadCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownloadCreate();
	BulkDownloadCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownloadCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BulkDownloadCampaignFilter getCampaignFilter();

	/*! \brief Set 
	 */
	void setCampaignFilter(BulkDownloadCampaignFilter  campaign_filter);
	/*! \brief Get All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	std::list<std::string> getEntityIds();

	/*! \brief Set All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	void setEntityIds(std::list <std::string> entity_ids);
	/*! \brief Get All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	std::list<BulkEntityType> getEntityTypes();

	/*! \brief Set All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	void setEntityTypes(std::list <BulkEntityType> entity_types);
	/*! \brief Get 
	 */
	BulkOutputFormat getOutputFormat();

	/*! \brief Set 
	 */
	void setOutputFormat(BulkOutputFormat  output_format);
	/*! \brief Get Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	std::string getUpdatedSince();

	/*! \brief Set Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	void setUpdatedSince(std::string  updated_since);

private:
	BulkDownloadCampaignFilter campaign_filter;
	std::list <std::string>entity_ids;
	std::list <BulkEntityType>entity_types;
	BulkOutputFormat output_format;
	std::string updated_since;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkDownloadCreate_H_ */
