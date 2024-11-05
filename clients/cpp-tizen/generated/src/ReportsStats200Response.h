/*
 * Reports_stats_200_response.h
 *
 * 
 */

#ifndef _Reports_stats_200_response_H_
#define _Reports_stats_200_response_H_


#include <string>
#include "CatalogsReportStats.h"
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

class Reports_stats_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Reports_stats_200_response();
	Reports_stats_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Reports_stats_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsReportStats> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsReportStats> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <CatalogsReportStats>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Reports_stats_200_response_H_ */
