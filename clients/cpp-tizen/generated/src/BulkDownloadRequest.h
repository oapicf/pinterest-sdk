/*
 * BulkDownloadRequest.h
 *
 * Ad entities to get in bulk request.
 */

#ifndef _BulkDownloadRequest_H_
#define _BulkDownloadRequest_H_


#include <string>
#include "BulkDownloadRequest_campaign_filter.h"
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


/*! \brief Ad entities to get in bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkDownloadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkDownloadRequest();
	BulkDownloadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkDownloadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	std::list<BulkEntityType> getEntityTypes();

	/*! \brief Set All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	void setEntityTypes(std::list <BulkEntityType> entity_types);
	/*! \brief Get All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	std::list<std::string> getEntityIds();

	/*! \brief Set All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	void setEntityIds(std::list <std::string> entity_ids);
	/*! \brief Get Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	std::string getUpdatedSince();

	/*! \brief Set Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	void setUpdatedSince(std::string  updated_since);
	/*! \brief Get 
	 */
	BulkDownloadRequest_campaign_filter getCampaignFilter();

	/*! \brief Set 
	 */
	void setCampaignFilter(BulkDownloadRequest_campaign_filter  campaign_filter);
	/*! \brief Get 
	 */
	BulkOutputFormat getOutputFormat();

	/*! \brief Set 
	 */
	void setOutputFormat(BulkOutputFormat  output_format);

private:
	std::list <BulkEntityType>entity_types;
	std::list <std::string>entity_ids;
	std::string updated_since;
	BulkDownloadRequest_campaign_filter campaign_filter;
	BulkOutputFormat output_format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkDownloadRequest_H_ */
