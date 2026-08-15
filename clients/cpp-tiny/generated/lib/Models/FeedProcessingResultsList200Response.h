
/*
 * Feed_processing_results_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Feed_processing_results_list_200_response_H_
#define TINY_CPP_CLIENT_Feed_processing_results_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedProcessingResult.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Feed_processing_results_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Feed_processing_results_list_200_response();
    Feed_processing_results_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Feed_processing_results_list_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<CatalogsFeedProcessingResult> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsFeedProcessingResult> items);


    private:
    std::string bookmark{};
    std::list<CatalogsFeedProcessingResult> items;
};
}

#endif /* TINY_CPP_CLIENT_Feed_processing_results_list_200_response_H_ */
