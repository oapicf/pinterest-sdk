
/*
 * BulkDownloadCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_BulkDownloadCreate_H_
#define TINY_CPP_CLIENT_BulkDownloadCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkDownloadCampaignFilter.h"
#include "BulkEntityType.h"
#include "BulkOutputFormat.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BulkDownloadCreate{
public:

    /*! \brief Constructor.
	 */
    BulkDownloadCreate();
    BulkDownloadCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkDownloadCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BulkDownloadCampaignFilter getCampaignFilter();

	/*! \brief Set 
	 */
	void setCampaignFilter(BulkDownloadCampaignFilter campaign_filter);
	/*! \brief Get All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	std::list<std::string> getEntityIds();

	/*! \brief Set All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
	 */
	void setEntityIds(std::list<std::string> entity_ids);
	/*! \brief Get All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	std::list<BulkEntityType> getEntityTypes();

	/*! \brief Set All entity types specified will be downloaded. Fewer types result in faster downloads.
	 */
	void setEntityTypes(std::list<BulkEntityType> entity_types);
	/*! \brief Get 
	 */
	BulkOutputFormat getOutputFormat();

	/*! \brief Set 
	 */
	void setOutputFormat(BulkOutputFormat output_format);
	/*! \brief Get Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	std::string getUpdatedSince();

	/*! \brief Set Unix UTC timestamp to retrieve all entities that have changed since this time.
	 */
	void setUpdatedSince(std::string updated_since);


    private:
    BulkDownloadCampaignFilter campaign_filter;
    std::list<std::string> entity_ids;
    std::list<BulkEntityType> entity_types;
    BulkOutputFormat output_format;
    std::string updated_since{};
};
}

#endif /* TINY_CPP_CLIENT_BulkDownloadCreate_H_ */
