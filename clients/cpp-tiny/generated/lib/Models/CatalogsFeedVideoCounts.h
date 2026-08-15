
/*
 * CatalogsFeedVideoCounts.h
 *
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedVideoCounts_H_
#define TINY_CPP_CLIENT_CatalogsFeedVideoCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedVideoCounts{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedVideoCounts();
    CatalogsFeedVideoCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedVideoCounts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of videos successfully ingested from the feed file.
	 */
	int getIngestedVideos();

	/*! \brief Set The number of videos successfully ingested from the feed file.
	 */
	void setIngestedVideos(int  ingested_videos);
	/*! \brief Get The number of videos that were not ingested from the feed file.
	 */
	int getNotIngestedVideos();

	/*! \brief Set The number of videos that were not ingested from the feed file.
	 */
	void setNotIngestedVideos(int  not_ingested_videos);
	/*! \brief Get The number of videos in the feed file.
	 */
	int getTotalVideos();

	/*! \brief Set The number of videos in the feed file.
	 */
	void setTotalVideos(int  total_videos);


    private:
    int ingested_videos{};
    int not_ingested_videos{};
    int total_videos{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedVideoCounts_H_ */
