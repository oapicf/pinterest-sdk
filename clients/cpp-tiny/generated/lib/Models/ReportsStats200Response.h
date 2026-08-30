
/*
 * Reports_stats_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Reports_stats_200_response_H_
#define TINY_CPP_CLIENT_Reports_stats_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsReportStats.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Reports_stats_200_response{
public:

    /*! \brief Constructor.
	 */
    Reports_stats_200_response();
    Reports_stats_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Reports_stats_200_response();


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
	void setBookmark(std::string bookmark);
	/*! \brief Get 
	 */
	std::list<CatalogsReportStats> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<CatalogsReportStats> items);


    private:
    std::string bookmark{};
    std::list<CatalogsReportStats> items;
};
}

#endif /* TINY_CPP_CLIENT_Reports_stats_200_response_H_ */
