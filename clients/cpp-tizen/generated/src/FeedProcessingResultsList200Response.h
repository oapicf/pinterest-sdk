/*
 * Feed_processing_results_list_200_response.h
 *
 * 
 */

#ifndef _Feed_processing_results_list_200_response_H_
#define _Feed_processing_results_list_200_response_H_


#include <string>
#include "CatalogsFeedProcessingResult.h"
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

class Feed_processing_results_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Feed_processing_results_list_200_response();
	Feed_processing_results_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Feed_processing_results_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsFeedProcessingResult> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsFeedProcessingResult> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <CatalogsFeedProcessingResult>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Feed_processing_results_list_200_response_H_ */
