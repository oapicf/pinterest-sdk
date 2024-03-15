/*
 * Ssio_order_lines_get_by_ad_account_200_response.h
 *
 * 
 */

#ifndef _Ssio_order_lines_get_by_ad_account_200_response_H_
#define _Ssio_order_lines_get_by_ad_account_200_response_H_


#include <string>
#include "SSIOOrderLine.h"
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

class Ssio_order_lines_get_by_ad_account_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Ssio_order_lines_get_by_ad_account_200_response();
	Ssio_order_lines_get_by_ad_account_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ssio_order_lines_get_by_ad_account_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get SSIO order lines by ad acount id
	 */
	std::list<SSIOOrderLine> getItems();

	/*! \brief Set SSIO order lines by ad acount id
	 */
	void setItems(std::list <SSIOOrderLine> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <SSIOOrderLine>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ssio_order_lines_get_by_ad_account_200_response_H_ */
