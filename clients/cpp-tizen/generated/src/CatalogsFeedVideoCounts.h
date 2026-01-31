/*
 * CatalogsFeedVideoCounts.h
 *
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */

#ifndef _CatalogsFeedVideoCounts_H_
#define _CatalogsFeedVideoCounts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedVideoCounts : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedVideoCounts();
	CatalogsFeedVideoCounts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedVideoCounts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int ingested_videos;
	int not_ingested_videos;
	int total_videos;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedVideoCounts_H_ */
